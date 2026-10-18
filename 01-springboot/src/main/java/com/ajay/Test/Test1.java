package com.ajay.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajay.Bean.WishApp;
import com.ajay.Config.AppConfig;

public class Test1 {
public static void main(String[] args)
{
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	  WishApp wa =  context.getBean("wish",WishApp.class); 	
	    System.out.print(wa.wishMsg("ajay"));
	  
}
}
