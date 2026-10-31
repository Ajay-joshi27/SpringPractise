package com.ajay.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ajay.Models.Student;
import com.ajay.dao.StudentDao;

public class App {

	public static void main(String[] args) {
	StudentDao studentDao = new StudentDao();
    studentDao.update(5,"anusha",22);
    
	}

}
