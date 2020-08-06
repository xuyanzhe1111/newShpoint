package com.example.demo.entity.select;

import lombok.Data;

@Data
public class TableRowEntity {
    private int id;
    private String rowname;
    private Integer tableid;

    public TableRowEntity(int id, String rowname, Integer tableid) {
        this.id = id;
        this.rowname = rowname;
        this.tableid = tableid;
    }
}
