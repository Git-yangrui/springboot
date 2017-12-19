package com.example.cloud.microservieconsumer.controller;


import com.example.cloud.microservieconsumer.FeignClient2;
import com.example.cloud.microservieconsumer.UserFeignClient;
import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Value("${user.userServicePath}")
//    private String userServicePath;
//
//    @GetMapping("/{id}")
//    public User findById(@PathVariable Long id){
//
//        return this.restTemplate.getForObject(userServicePath+id,User.class);
//    }


//
//    @Autowired
//    FeignClient2 feignClient2;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        User byId = userFeignClient.findById(id);
        return byId;
    }

//    @GetMapping("/simple1/{id}")
//    public User findbyId1(@PathVariable Long id){
//        return  feignClient2.getuser(id);
//    }
}
