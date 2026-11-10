package com.ajay.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajay.Entity.Naukriplatform;
import com.ajay.dao.IstudentDao;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private  IstudentDao dao;

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(dao.getClass().getName());
		
		//saving only on element
	//	dao.save(new Naukriplatform(1,"ajay",10));
		
		
		
		Naukriplatform n1= new Naukriplatform(3,"anusha",30);
		Naukriplatform n2= new Naukriplatform(4,"abhay",40);
		Naukriplatform n3= new Naukriplatform(5,"john",50);
		
		//save all objects to database
//		dao.saveAll(List.of(n1,n2,n3)).forEach(System.out::println);
		// total number of count
//		Integer count =(int) dao.count();
//		System.out.println(count);
		//printing all objects from database
//		dao.findAll().forEach(System.out::println);
		
		// finding by id
//		Optional<Naukriplatform> op=dao.findById(3);
//		if(op.isPresent())
//		{
//			System.out.println(op.get());
//		}
//		else {
//			System.out.println("not found");
//		}

	}

}
