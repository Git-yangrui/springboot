package com.citi.yangrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
@SpringBootApplication
public class HelloWorldExample {

    public static void main(String args[]) {
        SpringApplication.run(HelloWorldExample.class, args);
    }
}