package com.example.demo.security.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer id;
    private String username;
    private String userrealname;
    private String password;
    private String ipaddress;
    private String emailaddress;
    private Integer level;
    private String role;



    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userrealname='" + userrealname + '\'' +
                ", password='" + password + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                ", level=" + level +
                ", role='" + role + '\'' +
                '}';
    }
}
