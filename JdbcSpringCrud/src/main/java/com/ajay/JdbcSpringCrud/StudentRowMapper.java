package com.ajay.JdbcSpringCrud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ajay.Bean.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setAge(rs.getInt("age"));
		s.setGender(rs.getString("gender"));
		
		return s;
	}
	
	

}
