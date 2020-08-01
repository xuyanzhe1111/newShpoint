package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {

    @GetMapping("/hemo")
    public String Void(){
        return "test";
    }
    @GetMapping("/formData")
    public Object formData(){
        Map<String,FormDataObj> map= new HashMap<>();
        map.put("a",new FormDataObj("a","b+c","number"));
        map.put("b",new FormDataObj("b","c","number"));
        map.put("c",new FormDataObj("c",null,"number"));
        return map;
    }
    @GetMapping("/t")
    @ResponseBody
    public Object Data(HttpServletResponse response) throws IOException {
        Map<String,FormDataObj> map= new HashMap<>();
        map.put("a",new FormDataObj("a","data.b+data.c","number"));
        map.put("b",new FormDataObj("b","data.c","number"));
        map.put("c",new FormDataObj("c",null,"number"));
        String s="data={";
        for (Map.Entry<String,FormDataObj> e: map.entrySet()) {
            s=s+e.getKey()+":"+e.getValue().toString();
        }
        s=s+"}";
        return s;
    }

}
