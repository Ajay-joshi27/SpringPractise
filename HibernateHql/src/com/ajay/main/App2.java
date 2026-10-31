package com.ajay.main;

import com.ajay.Models.InsurancePolicy;
import com.ajay.dao.InsurancePolicyDao;

public class App2 {

	public static void main(String[] args) {
System.out.println("main method called ");
   InsurancePolicy p = new  InsurancePolicy();
   p.setPolicyName("Gold");
   p.setCompany("life insurance of india");
   p.setPolicyType("yearly");
   p.setTenure(20);
  InsurancePolicyDao ipdao = new InsurancePolicyDao();
  ipdao.save(p);
  
	}

}
