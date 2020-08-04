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
        String name=this.name;
        String calculation="";
        if(this.calculation!=null&&!this.calculation.isEmpty())
            calculation="function(){ with(this.data){"+name+"="+this.calculation+"}}";
        else
            calculation=null;
        String type=this.type;
        return "{name:'"+name+"',calculation:"+calculation+",type:'"+type+"'},";
    }
    public FormDataObj(String name, String calculation, String type) {
        this.name = name;
        this.calculation = calculation;
        this.type = type;

    }
}