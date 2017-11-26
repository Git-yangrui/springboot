package com.yangrui;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return  "Hello";
    }
    //spring boot 默认使用的是Jackson 框架
    @RequestMapping("/getStu")
    public Student getStud(){

        Student student=new Student();

        student.setStuId("12232");
        student.setStuName("Yangyang");
        student.setDate(new Date());
        return student;
    }
}
