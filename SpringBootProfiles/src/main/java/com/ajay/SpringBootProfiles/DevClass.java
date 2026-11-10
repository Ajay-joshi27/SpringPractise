package com.ajay.SpringBootProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevClass {

	
	public DevClass() {
		System.out.println("DevClass.DevClass() object created ");
	}
}
