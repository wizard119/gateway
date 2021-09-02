package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GatewayApplication {

	public static ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
