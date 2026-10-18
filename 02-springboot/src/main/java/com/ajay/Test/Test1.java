package com.ajay.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajay.Bean.Employee;
import com.ajay.Config.AppConfig;

public class Test1 {
public static void main(String[] args)
{
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
           Employee e =context.getBean("employee",Employee.class);
           System.out.println(e);
	  
}
}
