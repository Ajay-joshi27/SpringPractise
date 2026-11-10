package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class JDBCOperations {
       
	public void Insert(JdbcTemplate jtemp,Student s)
	{
	  String INSERTQUERY = "INSERT INTO NAUKRI(name,IMAGE,RESUME) values(?,?,?)";
	  byte[] imagefile = null;
	try {
		imagefile = Files.readAllBytes(s.getImage().toPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  byte[] resumefile = null;
	try {
		resumefile = Files.readAllBytes(s.getResume().toPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  jtemp.update(INSERTQUERY,
	  s.getName(),
	  imagefile,
	  resumefile);
	}
	
	//retriving data from database
	public void retriveOperation(JdbcTemplate jtemp) {
		String Fetch = "SELECT * FROM naukri";
		int[] count = {1};
		jtemp.query(Fetch, new RowMapper<>() {
              
			@Override
			public @Nullable Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				Student s = new Student();
				// TODO Auto-generated method stub
				
				
				
				
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				
				byte[] bytesofimage=rs.getBytes("image");
				byte[] r=rs.getBytes("resume");
				
				try {
					File f= new File(count[0]+"outputimage.jpg");
					FileOutputStream jpg = new FileOutputStream(f);
					jpg.write(bytesofimage);
					s.setImage(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					File f1= new File(count[0]+"outputText.pdf");
					FileOutputStream pdf = new FileOutputStream(f1);
					pdf.write(r);
					s.setResume(f1);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("code ran");
				count[0]++;
				
				return null;
			}
			
		}
			
		);
	}
}
