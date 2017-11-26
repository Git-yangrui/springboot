package com.example.cloud.microservieconsumer.controller;

import com.example.cloud.microservieconsumer.entity.User;
import com.example.cloud.microservieconsumer.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController  {


    @Autowired
    private UserRepositry userRepositry;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        User one = userRepositry.findOne(id);

        return one;
    }
}
