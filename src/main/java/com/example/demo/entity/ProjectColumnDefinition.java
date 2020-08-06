package com.example.demo.entity;

import java.util.Date;

public class ProjectColumnDefinition {
    private Integer projectcolumndefinitionid;

    private String columnname;

    private Integer columndatatype;

    private Integer queryconditionorder;

    private Date createtime;

    private Date changelasttime;

    public Integer getProjectcolumndefinitionid() {
        return projectcolumndefinitionid;
    }

    public void setProjectcolumndefinitionid(Integer projectcolumndefinitionid) {
        this.projectcolumndefinitionid = projectcolumndefinitionid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public Integer getColumndatatype() {
        return columndatatype;
    }

    public void setColumndatatype(Integer columndatatype) {
        this.columndatatype = columndatatype;
    }

    public Integer getQueryconditionorder() {
        return queryconditionorder;
    }

    public void setQueryconditionorder(Integer queryconditionorder) {
        this.queryconditionorder = queryconditionorder;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChangelasttime() {
        return changelasttime;
    }

    public void setChangelasttime(Date changelasttime) {
        this.changelasttime = changelasttime;
    }
}