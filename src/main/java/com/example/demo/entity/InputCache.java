package com.example.demo.entity;

import java.util.Date;

public class InputCache {
    private Integer inputcacheid;

    private String batchid;

    private String inputname;

    private String inputvalue;

    private Date createtime;

    private Date changelasttime;

    public Integer getInputcacheid() {
        return inputcacheid;
    }

    public void setInputcacheid(Integer inputcacheid) {
        this.inputcacheid = inputcacheid;
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getInputname() {
        return inputname;
    }

    public void setInputname(String inputname) {
        this.inputname = inputname;
    }

    public String getInputvalue() {
        return inputvalue;
    }

    public void setInputvalue(String inputvalue) {
        this.inputvalue = inputvalue;
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