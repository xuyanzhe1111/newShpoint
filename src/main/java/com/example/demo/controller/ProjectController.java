package com.example.demo.controller;


import com.example.demo.common.Consts;
import com.example.demo.common.Logger;
import com.example.demo.entity.GridDataJsonModel;
import com.example.demo.entity.ProjectColumnDefinition;
import com.example.demo.entity.ProjectColumnDefinitionDetail;
import com.example.demo.entity.ProjectData;
import com.example.demo.utils.excel.ExcelUtil;
import com.example.demo.mapper.ProjectColumnDefinitionMapper;
import com.example.demo.mapper.ProjectDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ProjectController {
    @Autowired
    ProjectDataMapper projectDataMapper;

    @Autowired
    ProjectColumnDefinitionMapper projectColumnDefinitionMapper;

    @Autowired
    ExcelUtil excelUtil;

    @GetMapping("projectData/project")
    public String getProjectMap(Model model){
        model.addAttribute("mainHtml","project");
        model.addAttribute("pdfname","project");
        return "newHtml/home";
    }

    @GetMapping("projectData/ImportExportProjectData")
//    @RolesAllowed({"ROLE_ADMIN","ROLE_OWERN"})
    public String getImportExportProjectDataMap(Model model){
        model.addAttribute("mainHtml","project");
        model.addAttribute("pdfname","ImportExportProjectData");
        return "newHtml/home";
    }

    @GetMapping("projectData/ProjectColumnDefinitionList")
//    @RolesAllowed({"ROLE_ADMIN","ROLE_OWERN"})
    public String getProjectColumnDefinitionListMap(Model model){
        model.addAttribute("mainHtml","project");
        model.addAttribute("pdfname","ProjectColumnDefinitionList");
        return "newHtml/home";
    }


    @GetMapping("projectData/getData")
    @ResponseBody
    public Object getData() throws IllegalAccessException {
        Logger.getInstance().info("start");
        ModelAndView modelAndView = new ModelAndView("ProjectData_New");
        //获取所有数据
        List<ProjectData> projectDataList = projectDataMapper.selectByExample(null);
        Logger.getInstance().info("projectDataList");
        //获取列表头信息
        List<ProjectColumnDefinition> definitionList = projectColumnDefinitionMapper.selectByExample(null);
        Logger.getInstance().info("definitionList");
        Map<String,Object> map=new HashMap<>();
        List<ProjectColumnDefinitionDetail> result = new ArrayList<>();
        Map<ProjectColumnDefinition, Field> dataFieldMap = excelUtil.getDataFieldMap(definitionList);
        for (Map.Entry<ProjectColumnDefinition, Field> fieldEntry : dataFieldMap.entrySet()) {
            if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_STRING) {
                ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                result.add(detail);
                List<String> stringValues = new ArrayList<>();
                detail.setStringValues(stringValues);
                for (ProjectData projectData : projectDataList) {
                    if (fieldEntry.getValue().get(projectData) != null) {
                        stringValues.add(fieldEntry.getValue().get(projectData).toString());
                    }
                }
                if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_LETTER) {
                    stringValues = stringValues.stream().distinct().collect(Collectors.toList());
                    String[] stringArray = stringValues.toArray(new String[stringValues.size()]);
                    Collator cmp = Collator.getInstance(Locale.CHINA);
                    Arrays.sort(stringArray, cmp);
                    detail.setStringValues(Arrays.asList(stringArray));
                } else if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_RATE) {
                    Map<String, Long> rateMap = stringValues.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
                    stringValues = rateMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
                    Collections.reverse(stringValues);
                    detail.setStringValues(stringValues);
                }
            } else if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC) {
                ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                result.add(detail);
                if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_NUMBER_VALUE) {
                    List<Double> doubleValues = new ArrayList<>();
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {
                            doubleValues.add(Double.parseDouble(fieldEntry.getValue().get(projectData).toString()));
                        }
                    }
                    doubleValues=doubleValues.stream().distinct().sorted().collect(Collectors.toList());
                    detail.setStringValues(new ArrayList<>());
                    doubleValues.forEach(x -> detail.getStringValues().add(String.valueOf(x)));
                } else if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_NUMBER_RANGE_) {
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {

                            double doubleValue = Double.parseDouble(fieldEntry.getValue().get(projectData).toString());
                            if (detail.getMinValue() == null || doubleValue < detail.getMinValue()) {
                                detail.setMinValue(doubleValue);
                            }
                            if (detail.getMaxValue() == null || doubleValue > detail.getMaxValue()) {
                                detail.setMaxValue(doubleValue);
                            }
                        }
                    }
                }
            }else if(fieldEntry.getKey().getColumndatatype()==Consts.COLUMNDATATYPE_URL){
                ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                result.add(detail);
            }
        }
        result.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
        map.put("data",projectDataList);
        map.put("head",result);
        modelAndView.addAllObjects(map);
        Logger.getInstance().info("end");
        return map;
    }


    @PostMapping("projectData/")
    public GridDataJsonModel getProjectColumnDefinitionDetailList() {
        GridDataJsonModel model = new GridDataJsonModel();
        try {
            List<ProjectColumnDefinitionDetail> result = new ArrayList<>();
            //获取所有数据
            List<ProjectData> projectDataList = projectDataMapper.selectByExample(null);
            //获取列表头信息
            List<ProjectColumnDefinition> definitionList = projectColumnDefinitionMapper.selectByExample(null);
            Map<ProjectColumnDefinition, Field> dataFieldMap = excelUtil.getDataFieldMap(definitionList);
            for (Map.Entry<ProjectColumnDefinition, Field> fieldEntry : dataFieldMap.entrySet()) {
                System.out.println(fieldEntry.getKey().getProjectcolumndefinitionid());
                if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_STRING) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    List<String> stringValues = new ArrayList<>();
                    detail.setStringValues(stringValues);
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {
                            stringValues.add(fieldEntry.getValue().get(projectData).toString());
                        }
                    }
                    if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_LETTER) {
                        stringValues = stringValues.stream().distinct().collect(Collectors.toList());
                        String[] stringArray = stringValues.toArray(new String[stringValues.size()]);
                        Collator cmp = Collator.getInstance(Locale.CHINA);
                        Arrays.sort(stringArray, cmp);
                        detail.setStringValues(Arrays.asList(stringArray));
                    } else if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_RATE) {
                        Map<String, Long> rateMap = stringValues.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
                        stringValues = rateMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
                        Collections.reverse(stringValues);
                        detail.setStringValues(stringValues);
                    }
                } else if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_NUMBER_VALUE) {
                        List<Double> doubleValues = new ArrayList<>();
                        for (ProjectData projectData : projectDataList) {
                            if (fieldEntry.getValue().get(projectData) != null) {
                                doubleValues.add(Double.parseDouble(fieldEntry.getValue().get(projectData).toString()));
                            }
                        }
                        doubleValues=doubleValues.stream().distinct().sorted().collect(Collectors.toList());
                        detail.setStringValues(new ArrayList<>());
                        doubleValues.forEach(x -> detail.getStringValues().add(String.valueOf(x)));
                    } else if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_NUMBER_RANGE_) {
                        for (ProjectData projectData : projectDataList) {
                            if (fieldEntry.getValue().get(projectData) != null) {

                                double doubleValue = Double.parseDouble(fieldEntry.getValue().get(projectData).toString());
                                if (detail.getMinValue() == null || doubleValue < detail.getMinValue()) {
                                    detail.setMinValue(doubleValue);
                                }
                                if (detail.getMaxValue() == null || doubleValue > detail.getMaxValue()) {
                                    detail.setMaxValue(doubleValue);
                                }
                            }
                        }
                    }
                }
            }
            result.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            model.setStatus("true");
            model.setData(result);
            model.setTotals(result.size());

        } catch (Exception ex) {
            Logger.getInstance().error("ex",ex);
            model.setStatus("false");
            model.setMessage(ex.getMessage());
        }
        return model;
    }
}
