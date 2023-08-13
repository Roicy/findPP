package com.example.myfirstspringbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.myfirstspringbootweb.DAO",
        "com.example.myfirstspringbootweb.mapper",
        "com.example.myfirstspringbootweb.service",
        "com.example.myfirstspringbootweb.controller",
        "com.example.myfirstspringbootweb.config",
        "com.example.myfirstspringbootweb.utils",
        "com.example.myfirstspringbootweb.entity",
        "com.example.myfirstspringbootweb.interceptor"})
public class MyfirstspringbootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfirstspringbootwebApplication.class, args);
        System.out.print('p');
    }

}
