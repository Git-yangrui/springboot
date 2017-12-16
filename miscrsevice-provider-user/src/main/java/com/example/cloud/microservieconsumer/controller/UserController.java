package com.example.cloud.microservieconsumer.controller;

import com.example.cloud.microservieconsumer.entity.User;
import com.example.cloud.microservieconsumer.repository.UserRepositry;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {

        System.out.println("----------------------------------------");
        User one = userRepositry.findOne(id);

        return one;
    }

    @GetMapping("/homePage")
    public String serviceUrl() {
        InstanceInfo localhost = eurekaClient.getNextServerFromEureka("MISCRSERVICE-PROVIDER-USER", false);
        return localhost.getHomePageUrl();
    }

    @GetMapping("/selfInfo")
    public ServiceInstance getSelfInfo() {

        return this.discoveryClient.getLocalServiceInstance();


    }
}
