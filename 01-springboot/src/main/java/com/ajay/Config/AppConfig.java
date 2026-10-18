package com.ajay.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ajay.Bean.WishApp;

@Configuration
public class AppConfig {
	{
		System.out.println("AppConfig.enclosing_method()");
	}
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	@Bean
	public WishApp wish() {
		WishApp wa = new WishApp();
		LocalDateTime ldtt =LocalDateTime.now();
		
		wa.setLdt(ldtt);
		return wa;
	}
	
	
}
