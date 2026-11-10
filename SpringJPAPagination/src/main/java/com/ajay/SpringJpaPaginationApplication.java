package com.ajay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ajay.dao")
@EntityScan(basePackages = "com.ajay.Entity")
public class SpringJpaPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPaginationApplication.class, args);
	}

}
