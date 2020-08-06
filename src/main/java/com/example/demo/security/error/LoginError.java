package com.example.demo.security.error;

public enum LoginError implements Error {
    ERROR_USERNAME(1, "用户名错误"),
    ERROR_PASSWORD(2, "密码错误"),
    ERROR_IP(3, "IP错误"),
    ERROR_VERIFICATION(4, "验证码错误"),
    ERROR_VERIFICATIONTIME(5, "验证码过期"),
    ERROR_HIGHESTAUTHORITY(6, "当前用户是最高权限用户，不允许外地IP登录"),
    ERROR_NOVERIFI(7, "请获取验证码后再输入");

    LoginError(int id, String errStr) {
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