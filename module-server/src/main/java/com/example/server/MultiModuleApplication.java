package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class MultiModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiModuleApplication.class, args);
	}

}
