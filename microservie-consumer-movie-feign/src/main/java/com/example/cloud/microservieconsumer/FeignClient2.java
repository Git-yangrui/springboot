package com.example.cloud.microservieconsumer;


import com.example.cloud.confg.Configuration1;
import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="miscrservice-provider-user",configuration = Configuration1.class)
public interface FeignClient2 {


//    @RequestLine("GET /user/simple/{id}")
    @RequestMapping(value = "/user/simple/{id}",method = RequestMethod.GET)
    User getuser(@PathVariable("id")Long id);
}
