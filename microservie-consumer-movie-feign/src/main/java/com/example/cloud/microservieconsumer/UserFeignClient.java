package com.example.cloud.microservieconsumer;

import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("miscrservice-provider-user")
public interface UserFeignClient {
//    @RequestMapping(method = RequestMethod.GET, value = "/stores")
//    List<Store> getStores();

    @RequestMapping(value="/user/simple/{id}",method= RequestMethod.GET)
    public User findById(@PathVariable("id") Long id); //

}