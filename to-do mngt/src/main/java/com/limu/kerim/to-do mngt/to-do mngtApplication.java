package com.limu.kerim.IssDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class IssDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssDemoApplication.class, args);
	}
}
