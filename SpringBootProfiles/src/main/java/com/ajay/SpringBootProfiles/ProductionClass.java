package com.ajay.SpringBootProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionClass {

	public ProductionClass() {
		super();
		System.out.println("ProductionClass.ProductionClass() Objectcreated");
	}

}
