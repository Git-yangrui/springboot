package com.example.cloud.microservieconsumer;

import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="miscrservice-provider-user",fallback = HystrixFeignClient.class)
public interface UserFeignClient {

    @RequestMapping(value="/user/simple/{id}",method= RequestMethod.GET)
     User findById(@PathVariable("id") Long id);

}