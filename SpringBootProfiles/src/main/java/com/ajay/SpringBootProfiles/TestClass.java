package com.ajay.SpringBootProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestClass {

	public TestClass() {
		super();
		System.out.println("TestClass.TestClass() object created");
	}

}
