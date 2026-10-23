package com.ajay.Bean;

import org.springframework.stereotype.Component;

@Component
public class BlueDart implements ICourier {

	@Override
	public String courierService(Integer cid) {
		// TODO Auto-generated method stub
		return "Bluedart company is providing service with id "+ cid +" ";
	}

	public BlueDart() {
		System.out.println("BlueDart object created");
	}
	
	 
}
