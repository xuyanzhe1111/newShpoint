package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class InputURLCache {
    private Integer inputcacheid;

    private String batchid;

    private String inputname;

    private String inputvalue;

    private Date createtime;

    private Date changelasttime;

    private String type;
}