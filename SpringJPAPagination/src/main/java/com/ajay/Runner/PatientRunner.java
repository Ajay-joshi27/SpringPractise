package com.ajay.Runner;



import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.ajay.Entity.Patient;
import com.ajay.dao.IPatientRepo;
import com.ajay.dao.IpatientPagination;
@Component
public class PatientRunner implements CommandLineRunner {
	
	@Autowired
 private IPatientRepo repo;
	
	@Autowired
	private IpatientPagination pagination;
 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
   System.out.println("command line runner");
   Patient p1 = new Patient("Rahul Sharma", 25, "Mumbai");
   Patient p2 = new Patient("Priya Verma", 30, "Delhi");
   Patient p3 = new Patient("Amit Kumar", 45, "Bangalore");
   Patient p4 = new Patient("Sneha Patel", 28, "Ahmedabad");
   Patient p5 = new Patient("Vikash Singh", 35, "Jaipur");
   Patient p6 = new Patient("Neha Gupta", 22, "Pune");
   Patient p7 = new Patient("Rohit Mehta", 40, "Hyderabad");
   Patient p8 = new Patient("Anjali Reddy", 32, "Chennai");
   Patient p9 = new Patient("Karan Malhotra", 50, "Chandigarh");
   Patient p10 = new Patient("Pooja Joshi", 27, "Kolkata");
//
//   repo.save(p1);
//   repo.save(p2);
//   repo.save(p3);
//   repo.save(p4);
//   repo.save(p5);
//   repo.save(p6);
//   repo.save(p7);
//   repo.save(p8);
//   repo.save(p9);
//   repo.save(p10);
//   repo.findAll().forEach(System.out::println);
   
   
//  pagination.findAll(PageRequest.of(1, 3)).forEach(System.out::println);;
    Pageable p = PageRequest.of(2, 4, Sort.by("pname"));
    System.out.println(p.getPageNumber());
}
   
	}


