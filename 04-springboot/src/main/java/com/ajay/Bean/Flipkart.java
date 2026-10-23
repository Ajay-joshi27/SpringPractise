package com.ajay.Bean;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart  {
     @Autowired
     @Qualifier("ekart")
	public ICourier cor;
	
	public Flipkart() {
    System.out.println("Flipakart object created");
	}

	
	 public String shopping(String username) {
		 
		 String msg = cor.courierService(new Random().nextInt(1000));
		 return "thankou "+username+" for shopping "+msg +"";
	 }

}
