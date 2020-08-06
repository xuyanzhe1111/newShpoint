package com.example.demo.security.error;

public enum UserError implements Error {
    ERROR_NOTENUUGHLEVEL(1, "用户等级低");
    UserError(int id, String errStr) {
        this.id=id;
        this.errStr=errStr;
    }
    Integer id;
    String errStr;

    @Override
    public String getErrStr() {
        return errStr;
    }

    @Override
    public String getErrId() {
        return id+"";
    }
}