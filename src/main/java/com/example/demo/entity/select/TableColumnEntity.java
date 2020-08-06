package com.example.demo.entity.select;

import lombok.Data;

@Data
public class TableColumnEntity {
    private String columnname;
    private String columnsymbol;

    public TableColumnEntity( String columnname, String columnsymbol) {
        this.columnname = columnname;
        this.columnsymbol = columnsymbol;
    }
    public TableColumnEntity() {
    }
}

