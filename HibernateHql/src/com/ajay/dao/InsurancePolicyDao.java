package com.ajay.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ajay.Models.InsurancePolicy;
import com.ajay.util.HibernateUtil;

public class InsurancePolicyDao {
   
	SessionFactory s = HibernateUtil.getSessionFactory();
		
	
	public void save(InsurancePolicy policy) {
		Session session =s.openSession();
			Transaction t  = session.beginTransaction();
			session.save(policy);
			t.commit();
			session.close();
			System.out.println("policy saved sucessfully");
	}
}
