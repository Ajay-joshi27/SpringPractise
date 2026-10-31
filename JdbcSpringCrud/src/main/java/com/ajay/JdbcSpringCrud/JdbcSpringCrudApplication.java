package com.ajay.JdbcSpringCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcSpringCrudApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(JdbcSpringCrudApplication.class, args);
		
		Jdbc operation = context.getBean("jdbc",Jdbc.class);
//		operation.insertOperation();
//		operation.updateOperation();
//		operation.readOperation(2);
		operation.deleteOperation();
	}

}
