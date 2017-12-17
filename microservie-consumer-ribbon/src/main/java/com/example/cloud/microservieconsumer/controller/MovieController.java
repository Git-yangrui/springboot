package com.example.cloud.microservieconsumer.controller;


import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public  User findById(@PathVariable Long id) {

        User forObject = this.restTemplate.getForObject("http://miscrservice-provider-user/user/simple/" + id, User.class);

        return forObject;
    }


    @GetMapping("get")
    public User get(){

        User user=new User();
        user.setId(1111l);
        user.setName("yangyang");
        return user;
    }
}
