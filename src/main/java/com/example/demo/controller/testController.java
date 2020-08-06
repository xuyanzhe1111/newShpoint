package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {

    @GetMapping("/t")
    @ResponseBody
    public Object Data(HttpServletResponse response) throws IOException {
        Map<String,FormDataObj> map= new HashMap<>();
        map.put("a",new FormDataObj("a","b+c","number"));
        map.put("b",new FormDataObj("b","c","number"));
        map.put("c",new FormDataObj("c",null,"number"));
        String s="data={";
        for (Map.Entry<String,FormDataObj> e: map.entrySet()) {
            s=s+e.getKey()+":"+e.getValue().toString();
        }
        s=s+"}";
        return s;
    }


    @GetMapping("/post")
    @ResponseBody
    public Object getData(HttpServletResponse response) throws IOException, ScriptException {
        ScriptEngineManager manager =new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("js");
        Map<String,String> map=new HashMap<>();
        map.put("aa","return a+b+c;");
        map.put("bb","return b+c;");
        map.put("cc","if(a==1) " +
                "   return a;" +
                "else " +
                "   return b;");
        engine.eval("var a= 1");
        engine.eval("var b= 1");
        engine.eval("var c= 1");
        Map<String,Object> result=new HashMap<>();
        for (Map.Entry<String,String> e:map.entrySet()) {
            result.put(e.getKey(),engine.eval("(function(){"+e.getValue()+"})()"));
        }
        return null;
    }

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("###################.###");
        System.out.println(decimalFormat.format(0.0101100));//"-"表示输出的数左对齐（默认为右对齐）。
    }
}
