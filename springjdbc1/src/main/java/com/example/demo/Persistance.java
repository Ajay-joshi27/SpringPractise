package com.example.demo;

import java.io.File;
import java.sql.JDBCType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class Persistance implements ApplicationRunner {

	@Autowired
	private JdbcTemplate jtemp;
	@Autowired
	private JDBCOperations operations;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(jtemp);
		System.out.println("code running from persistanceclass");
		
//		Student s = new Student();
//		s.setName("ajay joshi");
//		s.setImage(new File("F:\\AJAY PHOTOS\\ajay ns pics\\IMG_0152.jpg"));
//		s.setResume(new File("C:\\Users\\Ajay Joshi\\Desktop\\anusha\\anusha resumes\\Wipro\\Anusha_a_susaladi.pdf"));
//		operations.Insert(jtemp, s);
		
		operations.retriveOperation(jtemp);
	}
	

}
