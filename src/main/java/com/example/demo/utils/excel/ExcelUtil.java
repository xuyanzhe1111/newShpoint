package com.example.demo.utils.excel;


import com.example.demo.common.Consts;
import com.example.demo.common.CustomerException;
import com.example.demo.common.Logger;
import com.example.demo.entity.ProjectColumnDefinition;
import com.example.demo.entity.ProjectData;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ExcelUtil {
    /**
     * 检验文件是否有效
     *
     * @param file
     * @throws Exception
     */
    public void checkFile(MultipartFile file) throws Exception {
        // 判断文件是否存在
        if (null == file) {
            throw new CustomerException("文件不存在！");
        }
        // 获得文件名
        String fileName = file.getOriginalFilename();
        // 判断文件是否是excel文件
        if (!fileName.endsWith("xls") && !fileName.endsWith("xlsx")) {
            throw new CustomerException(fileName + "不是excel文件");
        }
    }

    /**
     * 获取workbook
     *
     * @param file
     * @return
     */
    public Workbook getWorkBook(MultipartFile file) {
        // 获得文件名
        String fileName = file.getOriginalFilename();
        // 创建Workbook工作薄对象，表示整个excel
        Workbook workbook = null;
        try {
            // 获取excel文件的io流
            InputStream is = file.getInputStream();
            // 根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if (fileName.endsWith(".xls")) {
                // 2003
                workbook = new HSSFWorkbook(is);
            } else if (fileName.endsWith(".xlsx")) {
                // 2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {

        }
        return workbook;
    }

    /**
     * 获取解析后的文件内容
     *
     * @return
     */
    public List<ProjectData> readExcel(MultipartFile file, int columns) throws Exception {
        List<ProjectData> list = new ArrayList<ProjectData>();
        checkFile(file);
        // 获得Workbook工作薄对象
        Workbook workbook = getWorkBook(file);
        // 获取第一个张表
        Sheet sheet = workbook.getSheetAt(0);
        //判断后续表行是否已经没有数据了
        boolean rowEndFlag = false;
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            try {
                Row row = sheet.getRow(r); // 获取行
                boolean rowHasData = checkRowHasData(columns, row);
                if(rowHasData){
                    if(rowEndFlag){
                        throw new CustomerException("中间不能有空白行");
                    }
                }else{
                    rowEndFlag = true;
                    continue;
                }
                // 获取单元格中的值并存到对象中
                ProjectData ProjectData = new ProjectData();
                String strId = row.getCell(0).toString();
                int id;
                try {
                    id = (int) (Double.parseDouble(strId));
                } catch (Exception ex) {
                    Logger.getInstance().error("ex",ex);
                    throw new CustomerException("第" + (r + 1) + "行序号不正确");
                }

                ProjectData.setProjectdataid(id);
                ProjectData.setProjectname(row.getCell(1).toString());
                for (int column = 1; column <= columns; column++) {
                    if(row.getCell(column + 1)==null
                            || StringUtils.isEmptyOrWhitespace(row.getCell(column + 1).toString())){
                        throw new CustomerException("第" + (r + 1) + "行存在空白列");
                    }
                    Field dataColumnFeild = ProjectData.class.getDeclaredField("datacolumn" + column);
                    dataColumnFeild.setAccessible(true);
                    dataColumnFeild.set(ProjectData, row.getCell(column + 1).toString());
                }
                list.add(ProjectData);
            }catch (CustomerException cex){
                throw cex;
            }
            catch (Exception ex) {
                throw new CustomerException("第" + (r + 1) + "行数据不正确，序号必须为数字，其他列不能为空");
            }
        }
        return list;
    }

    private boolean checkRowHasData(int columns, Row row){
        for (int column = 0; column <= columns; column++) {
            if (row.getCell(column) != null
                    && !StringUtils.isEmptyOrWhitespace(row.getCell(column).toString())) {
                return true;
            }
        }
        return false;
    }

    public HSSFWorkbook getHSSFWorkbook(List<ProjectData> datalist, List<ProjectColumnDefinition> definitionList) {

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        try {
            // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet sheet = wb.createSheet();
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
            HSSFRow row = sheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
            int column = 0;
            HSSFCell cell1 = row.createCell(column++);
            cell1.setCellValue("序号");
            cell1.setCellStyle(style);
            HSSFCell cell2 = row.createCell(column++);
            cell2.setCellValue("名称");
            cell2.setCellStyle(style);
            Map<Integer, ProjectColumnDefinition> definitionMap = new HashMap<>();
            definitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            for (ProjectColumnDefinition projectColumnDefinition : definitionList) {
                HSSFCell cell3 = row.createCell(column++);
                cell3.setCellValue(projectColumnDefinition.getColumnname());
                cell3.setCellStyle(style);
                definitionMap.put(projectColumnDefinition.getProjectcolumndefinitionid(), projectColumnDefinition);
            }
            Map<ProjectColumnDefinition, Field> dataFieldMap = getDataFieldMap(definitionList);
            Map<Integer, Field> indexFieldMap = dataFieldMap.entrySet().stream()
                    .collect(Collectors.toMap(x -> x.getKey().getProjectcolumndefinitionid(), x -> x.getValue()));
            //创建内容
            for (int i = 0; i < datalist.size(); i++) {
                //第一行是表头，第二行开始插数据
                row = sheet.createRow(i + 1);
                int dataColumn = 0;
                ProjectData projectData = datalist.get(i);
                Cell idCell = row.createCell(dataColumn++);
                idCell.setCellValue(projectData.getProjectdataid());
                idCell.setCellType(Cell.CELL_TYPE_NUMERIC);
                Cell nameCell = row.createCell(dataColumn++);
                nameCell.setCellValue(projectData.getProjectname());
                nameCell.setCellType(Cell.CELL_TYPE_STRING);

                for (int dataColumnIndex = 1; dataColumnIndex <= definitionList.size(); dataColumnIndex++) {
                    Field dataColumnField = indexFieldMap.get(dataColumnIndex);
                    Cell dataCell = row.createCell(dataColumn++);
                    Object dataColumnValue = dataColumnField.get(projectData);
                    if (dataColumnValue == null) {
                        dataCell.setCellValue(Consts.NULL);
                        dataCell.setCellType(Cell.CELL_TYPE_STRING);
                    } else {
                        String value = dataColumnValue.toString();
                        boolean isNumberic = definitionMap.get(dataColumnIndex).getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC;
                        if (isNumberic) {
                            dataCell.setCellValue(Double.parseDouble(value));
                            dataCell.setCellType(Cell.CELL_TYPE_NUMERIC);
                        } else {
                            dataCell.setCellValue(value);
                            dataCell.setCellType(Cell.CELL_TYPE_STRING);
                        }
                    }
                }
            }
        } catch (Exception ex) {

        }
        return wb;
    }

    public Map<ProjectColumnDefinition, Field> getDataFieldMap(List<ProjectColumnDefinition> columnDefinitionList) {
        Map<ProjectColumnDefinition, Field> dataFieldMap = new HashMap<>();
        try {
            for (ProjectColumnDefinition columnDefinition : columnDefinitionList) {
                Field dataColumnFeild = ProjectData.class.getDeclaredField("datacolumn"
                        + columnDefinition.getProjectcolumndefinitionid());
                dataColumnFeild.setAccessible(true);
                dataFieldMap.put(columnDefinition, dataColumnFeild);
            }
        } catch (Exception ex) {

        }
        return dataFieldMap;
    }
}
