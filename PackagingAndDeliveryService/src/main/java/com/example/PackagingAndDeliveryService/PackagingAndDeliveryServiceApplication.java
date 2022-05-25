package com.example.PackagingAndDeliveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PackagingAndDeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagingAndDeliveryServiceApplication.class, args);
	}

}
