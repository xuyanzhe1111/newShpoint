package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class FormDataObj{
    String name;
    String calculation;
    String type;
    public String toString(){
        return "{name:'"+name+"',calculation:function(){ data."+name+"="+calculation+"},type:'"+type+"'},";
    }
    public FormDataObj(String name, String calculation, String type) {
        this.name = name;
        this.calculation = calculation;
        this.type = type;

    }
}