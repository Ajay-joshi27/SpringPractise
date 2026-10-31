package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		
		 SpringApplication.run(DemoApplication.class, args);
		 
	ApplicationContext app  = new ClassPathXmlApplicationContext("spring.xml");
	
	Ajay a=app.getBean("a",Ajay.class);
		a.m1();
		System.out.println("hlo ajay joshi ");
	}

}
