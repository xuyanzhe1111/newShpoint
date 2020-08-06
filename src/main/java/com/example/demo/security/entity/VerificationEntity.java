package com.example.demo.security.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VerificationEntity {

    private Integer userid;
    private String code;
    private LocalDateTime createtime;

    public VerificationEntity(Integer userid, String code) {
        this.userid = userid;
        this.code = code;
    }

    public VerificationEntity(Integer userid, String code,LocalDateTime createtime) {
        this.userid = userid;
        this.code = code;
        this.createtime=createtime;
    }

    public VerificationEntity(){

    }
}
