package com.yangrui;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return  "Hello";
    }

    @RequestMapping("/getStu")
    public Student getStud(){

        Student student=new Student();

        student.setStuId("12232");
        student.setStuId("Yangyang");

        return student;
    }
}
