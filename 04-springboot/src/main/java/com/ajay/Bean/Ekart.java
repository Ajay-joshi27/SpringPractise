package com.ajay.Bean;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier {

	@Override
	public String courierService(Integer cid) {
		// TODO Auto-generated method stub
		return "Ekart company is providing service with id "+ cid +" ";
	}

	public Ekart() {
			System.out.println("Ekart Object created ");
	}
	
	

}
