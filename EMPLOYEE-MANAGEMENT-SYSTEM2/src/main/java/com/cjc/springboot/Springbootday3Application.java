package com.cjc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class Springbootday3Application {

	public static void main(String[] args) {
		System.out.println("This is Spring Boot Application");
		SpringApplication.run(Springbootday3Application.class, args);
	}

}
