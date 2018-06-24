package com.springboot.example.Service;

import com.springboot.example.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    public Student selectStudentById(long id){
          return new Student(20l,"sdsdsdsd");
    }
}
