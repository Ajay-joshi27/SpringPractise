package com.ajay.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.ajay")
public class AppConfig {
	{
		System.out.println("AppConfig.enclosing_method()");
	}
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	@Bean(value = "ldt")
	public LocalDateTime ldt() {
		return LocalDateTime.now().withDayOfMonth(1);
	}
	
	
}
