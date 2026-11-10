package com.ajay.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ajay.Entity.Naukriplatform;
@Component
public interface IstudentDao extends CrudRepository<Naukriplatform, Integer> {
	

}
