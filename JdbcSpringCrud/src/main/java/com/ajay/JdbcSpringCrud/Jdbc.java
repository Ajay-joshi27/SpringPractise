package com.ajay.JdbcSpringCrud;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ajay.Bean.Student;

@Component
public class Jdbc  {
	
	@Autowired
	private JdbcTemplate jdbctemp;
	    
	    
	    public Jdbc() {
		super();
		System.out.println("Jdbc class created");
	}

           //Insert operation begun
		public void insertOperation() {
	    	String insert= "INSERT INTO STUDENTS(name,age,gender) values(?,?,?)";
		    
		    
		    String name = "ajay";
		    int age= 20;
		    String gender = "m";
		    int result = jdbctemp.update(insert,name,age,gender);
	    if(result>0)
	    {
	    	System.out.println("Sucessfullpy update");
	    }
	    else
	    {
	    	System.out.println("Updation Failed");
	    }
	    }
		
		// UPDATE OPERATION 
		public void updateOperation() {
	    	String update= "UPDATE STUDENTS set name=?,age=?,gender=? WHERE ID =?";
		    
		    
		    String name = "anusha";
		    int age= 25;
		    String gender = "F";
		    int ID=2;
		    int result = jdbctemp.update(update,name,age,gender,ID);
	    if(result>0)
	    {
	    	System.out.println("Sucessfully update TABLE STUDENT");
	    }
	    else
	    {
	    	System.out.println("Updation Failed");
	    }
	    }
		
		//READ OPERATION
		
		public void readOperation(int id) {
			
			String read = "SELECT * FROM STUDENTS WHERE ID=?";
			
			StudentRowMapper mapper = new StudentRowMapper();
			Student student= jdbctemp.queryForObject(read,mapper,id);
				
			System.out.println(student);
		}
		public void deleteOperation() {
			String delete = "DELETE FROM STUDENTS WHERE ID = ?";
			 final int ID =2;
			int result=jdbctemp.update(delete,ID);
			 if(result>0)
			    {
				 System.out.println("sucessfully delete data from table");
			    }
			    else
			    {
			    	System.out.println("Updation Failed");
			    }
			
		}
  
}
