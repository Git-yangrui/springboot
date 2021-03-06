package com.example.cloud.microservieconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservieProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservieProviderUserApplication.class, args);
	}
}
