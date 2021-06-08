package com.inn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientProducerApplication.class, args);
	}

}
