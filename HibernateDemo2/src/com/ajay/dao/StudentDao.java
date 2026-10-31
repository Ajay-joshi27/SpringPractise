package com.ajay.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ajay.Models.BankAccount;
import com.ajay.Models.Student;
import com.ajay.util.HibernateUtil;


public class StudentDao {

	private static SessionFactory sessionFactory ;
	
	 public StudentDao() {
	        sessionFactory = HibernateUtil.getSessionFactory();
	    }

	 
	 public  void save(String name,int acno) {
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 BankAccount b = new BankAccount();
		  b.setName(name);
		 b.setAccountNumber(acno);
		 
		 session.saveOrUpdate(b);
		 transaction.commit();
		 session.close();
		 	
	 }
	 
	 public void update() {
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 BankAccount b = session.get(BankAccount.class, 6);
		 b.setAccountNumber(88888);
		 session.saveOrUpdate(b);
		 transaction.commit();
		 session.close();
	 }
	 
	
	 
}
