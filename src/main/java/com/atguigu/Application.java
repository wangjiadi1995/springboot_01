package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication//声明当前项目是一个springboot工程
public class Application {

    public static void main(String[] args) {
        //启动服务器，springboot项目内置tomcat
        SpringApplication.run(Application.class,args);
    }

}
