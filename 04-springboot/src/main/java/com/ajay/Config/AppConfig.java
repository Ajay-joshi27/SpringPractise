package com.ajay.Config;




import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.ajay")
public class AppConfig {

	
	public AppConfig() {
		System.out.println("AppConfig object created");
	}
	
	
	
}
