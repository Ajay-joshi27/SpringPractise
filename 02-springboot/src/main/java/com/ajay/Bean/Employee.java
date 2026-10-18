package com.ajay.Bean;

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

public Employee() {
	super();
	System.out.println("employee classs loaded");
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
}


}
