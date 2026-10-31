package com.ajay.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ajay.Models.Student;
import com.ajay.util.HibernateUtil;


public class StudentDao {

	private static SessionFactory sessionFactory ;
	
	 public StudentDao() {
	        sessionFactory = HibernateUtil.getSessionFactory();
	    }

	 
	 public  void save(Student s) {
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		 session.save(s);
		 transaction.commit();
		 session.close();
		 	
		 
	 }
	 
	 public  void update(int id,String name,int age) {
		 
		 try {
			 Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 Student s =session.get(Student.class,id);
		          s.setName(name);
		          s.setAge(age);
			 
			 session.update(s);
			 transaction.commit();
			 session.close();
		 }
		catch (Exception e) {
			e.printStackTrace();
		}
		 
		
	 }
	 
}
