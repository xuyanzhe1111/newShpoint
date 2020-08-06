package com.example.demo.entity.select;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTableEntity {
    private String tablename;
    private Integer id;
    private String tablesymbol;

    private Integer columnid = null;
    private String columnsJSON=null;
    private String rowsJSON=null;

    public DataTableEntity(String tablename,String tablesymbol){
        this.tablename=tablename;
        this.tablesymbol=tablesymbol;
    }

    public DataTableEntity( Integer id,String tablename, String tablesymbol) {
        this.tablename = tablename;
        this.id = id;
        this.tablesymbol = tablesymbol;
    }

    public DataTableEntity(){

    }
}
