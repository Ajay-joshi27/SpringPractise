package com.ajay.Bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee {
	@Value("${in.id}")
	
private Integer eid;
	@Value("${in.name}")
	
private String name;
@Value("${in.salary}")
private Float salary;

@Autowired
public LocalDateTime time;

public Employee() {
	super();
	System.out.println("employee classs loaded");
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "    time = "+time+"]";
}


}
