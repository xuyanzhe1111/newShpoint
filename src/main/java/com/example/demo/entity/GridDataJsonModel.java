package com.example.demo.entity;

import java.util.List;

public class GridDataJsonModel<T> {
    private String status;
    private Integer totals;
    private List<T> Data;
    private String message;
    private List<T> headers;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getHeaders() {
        return headers;
    }

    public void setHeaders(List<T> headers) {
        this.headers = headers;
    }
}
