package com.example.demo.utils.excel;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.CustomerException;
import com.example.demo.entity.select.DataTableEntity;
import com.example.demo.entity.select.TableColumnEntity;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Component
public class DataTableExcelUtil {
    /**
     * 检验文件是否有效
     *
     * @param file
     * @throws Exception
     */
    private Integer cellWidth=30*256,cellHeight=30;
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

//    public static void main(String[] args) throws Exception {
//        File file = new File("C:\\Users\\Administrator\\Desktop\\工作簿1.xls");
//        FileInputStream input = new FileInputStream(file);
//        MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));
//        DataTableEntity tableEntity=new DataTableEntity();
//        new DataTableExcelUtil().readExcel(multipartFile,tableEntity);
//        Map<String, TableColumnEntity> columnMap=new HashMap<>();
//        Map<String, Map<String,String>> dataMap=new HashMap<>();
//        columnMap=JSON.parseObject(tableEntity.getColumnsJSON(),new TypeReference< Map<String, TableColumnEntity>>() {});
//        dataMap=JSON.parseObject(tableEntity.getRowsJSON(),new TypeReference< Map<String, Map<String,String>>>() {});
//        try {
//            Workbook workbook =  new DataTableExcelUtil().getHSSFWorkbook(columnMap,dataMap);
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//            String fileName = "excel导出结果" + sdf.format(new Date());
//            try {
//                FileOutputStream os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\132.xls");
//                workbook.write(os);
//                os.flush();
//                os.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception ex) {
//            Logger.getInstance().error("ex",ex);
//        }
//        System.out.println(123);
//    }
    public DataTableEntity readExcel(MultipartFile file, DataTableEntity entity) throws Exception {
        // 获得Workbook工作薄对象
        Workbook workbook = getWorkBook(file);
        //检查是否是excel文件
        checkFile(file);
        // 获取第一个张表
        Sheet sheet = workbook.getSheetAt(0);
        //判断后续表行是否已经没有数据了
        Row rowS, rowN; // 获取行
        Map<String, TableColumnEntity> columnMap = new HashMap<>();
        Iterator<Row> ir = sheet.rowIterator();
        Iterator<Cell> ic;
        if (ir.hasNext())
            rowS = ir.next();
        else
            throw new CustomerException("缺失数据");
        ic = rowS.cellIterator();
        while (ic.hasNext()) {
            Cell col = ic.next();
            System.out.println(col.getCellType());
            if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                continue;
            else if (col.getColumnIndex() < 1)
                continue;
            TableColumnEntity newCol = new TableColumnEntity();
            col.setCellType(Cell.CELL_TYPE_STRING);
            newCol.setColumnsymbol(col.toString());
            columnMap.put(col.getColumnIndex() + "", newCol);
        }
        if (ir.hasNext())
            rowS = ir.next();
        else
            throw new CustomerException("缺失数据");
        ic = rowS.cellIterator();
        while (ic.hasNext()) {
            Cell col = ic.next();
            if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                continue;
            else if (col.getColumnIndex() < 1)
                continue;
            col.setCellType(Cell.CELL_TYPE_STRING);
            columnMap.get(col.getColumnIndex() + "").setColumnname(col.toString());
        }
        Map<String, Map<String, String>> dataMap = new LinkedHashMap<>();
        try{
            while (ir.hasNext()) {
                rowS = ir.next();
                ic = rowS.cellIterator();
                Cell colname = ic.next();
                if (colname.getCellType() == Cell.CELL_TYPE_BLANK)
                    continue;
                colname.setCellType(Cell.CELL_TYPE_STRING);
                String rowname = colname.toString();
                Map<String, String> rowmap = new LinkedHashMap<>();
                rowmap.put("key",rowname);
                while (ic.hasNext()) {
                    Cell col = ic.next();
                    if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                        continue;
                    col.setCellType(Cell.CELL_TYPE_STRING);
                    rowmap.put(columnMap.get(col.getColumnIndex() + "").getColumnsymbol(), col.toString());
                }
                dataMap.put(rowS.getRowNum()+"", rowmap);
            }
        }catch (NoSuchElementException e){

        }
        String cs= JSON.toJSONString(columnMap);
        String ds=JSON.toJSONString(dataMap);
        entity.setColumnsJSON(cs);
        entity.setRowsJSON(ds);
        return entity;
    }
    public Workbook getHSSFWorkbook(Map<String, TableColumnEntity> columnMap,Map<String, Map<String,String>> dataMap) {
        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        Workbook wb = new HSSFWorkbook();
        try {
            // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
            Sheet sheet = wb.createSheet();
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
            int columnn = 0,rown=0;
            sheet.setColumnWidth(rown, cellWidth);
            Row row1 = sheet.createRow(rown++);
            sheet.setColumnWidth(rown, cellWidth);
            Row row2 = sheet.createRow(rown++);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            CellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
            Cell cell1 = row1.createCell(columnn);
            Cell cell2 = row2.createCell(columnn++);
            cell1.setCellValue("");
            cell1.setCellStyle(style);
            cell2.setCellValue("");
            cell2.setCellStyle(style);
            Iterator<Map.Entry<String, TableColumnEntity>> ic=columnMap.entrySet().iterator();
            List <String> sortLis=new ArrayList<>();
            while (ic.hasNext()) {
                TableColumnEntity entity=ic.next().getValue();
                cell1 = row1.createCell(columnn);
                cell1.setCellValue(entity.getColumnsymbol());
                cell1.setCellStyle(style);
                cell2 = row2.createCell(columnn++);
                cell2.setCellValue(entity.getColumnname());
                cell2.setCellStyle(style);
                sortLis.add(entity.getColumnsymbol());
            }
            Iterator<Map.Entry<String, Map<String,String>>> di=dataMap.entrySet().iterator();
            while (di.hasNext()){
                sheet.setColumnWidth(rown, cellWidth);
                Row row = sheet.createRow(rown++);
                Map.Entry<String, Map<String,String>> temp=di.next();
                columnn=0;
                Cell cell= row.createCell(columnn++);
                cell.setCellStyle(style);
                Map<String,String> rowData=temp.getValue();
                Iterator<String> i=sortLis.iterator();
                cell.setCellValue(rowData.get("key"));
                while (i.hasNext()){
                    cell = row.createCell(columnn++);
                    cell.setCellStyle(style);
                    cell.setCellValue(rowData.get(i.next()));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return wb;
    }

}
