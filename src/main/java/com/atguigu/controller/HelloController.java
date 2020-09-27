package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//组合注解，相当于@Controller + @ResponseBody
public class HelloController {
    @Autowired
    DataSourceProperties dataSourceProperties;
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(dataSourceProperties);
        return "hello world";
    }
}
