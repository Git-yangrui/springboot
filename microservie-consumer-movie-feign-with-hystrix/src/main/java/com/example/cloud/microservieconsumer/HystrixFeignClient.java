package com.example.cloud.microservieconsumer;

import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixFeignClient  implements UserFeignClient{
        @Override
        public User findById(Long id) {

            User user=new User();
            user.setId(100L);
            return user;
        }
    }