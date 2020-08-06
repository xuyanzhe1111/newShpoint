package com.example.demo.security.entity;

import java.util.ArrayList;
import java.util.List;

public enum  RoleEntity {
    USER(1,"用户"),SUPERUSER(2,"超级用户"),ADMIN(3,"管理员"),OWERN(4,"超级管理员");
    RoleEntity(int level,String username){
        this.level=level;
        this.username=username;
    };
    private int level;
    private String username;

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
    public static RoleEntity getRoleByLevel(int level){
        switch (level){
            case 1: return USER;
            case 2: return SUPERUSER;
            case 3: return ADMIN;
            case 4: return OWERN;
            default:return null;
        }
    }

    public static RoleEntity getRoleByString(String username){
        switch (username){
            case "用户": return USER;
            case "超级用户": return SUPERUSER;
            case "管理员": return ADMIN;
            case "超级管理员": return OWERN;
            default:return null;
        }
    }

    public static List<String> getRoleNameListUnderLevel(int level){
        if(level>4)
            return null;
        List<String > l=new ArrayList<>();
        for(int i=1;i<=level;i++){
            l.add(RoleEntity.getRoleByLevel(i).getUsername());
        }
        return l;
    }
}
