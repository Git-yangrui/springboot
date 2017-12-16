package com.example.cloud.microservieconsumer;

import com.example.cloud.microservieconsumer.interf.MyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservieConsumerApplication implements CommandLineRunner{


	@Autowired
	List<MyInterface> myInterfaces;

	public static void main(String[] args) {
		SpringApplication.run(MicroservieConsumerApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("---------------");
	}
}
