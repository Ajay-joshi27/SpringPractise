package com.ajay.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ajay.Bean.Flipkart;
import com.ajay.Config.AppConfig;

public class Test1 {
public static void main(String[] args)
{
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] arr = context.getBeanDefinitionNames();
        
        for (String string : arr) {
			System.out.println(string);
		}
        
        Flipkart f =context.getBean("flipkart", Flipkart.class);
        String msg =f.shopping("ajay");
        System.out.println(msg);
        ((AbstractApplicationContext) context).close();
}
}
