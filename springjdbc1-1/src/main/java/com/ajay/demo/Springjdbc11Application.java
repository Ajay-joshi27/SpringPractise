package com.ajay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ajay")
@EnableJpaRepositories(basePackages = "com.ajay.dao")
@EntityScan(basePackages = "com.ajay.Entity")
public class Springjdbc11Application {

	public static void main(String[] args) {
		SpringApplication.run(Springjdbc11Application.class, args);
		
		
	}

}
