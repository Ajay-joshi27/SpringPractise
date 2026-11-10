package com.ajay.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ajay.Entity.Patient;
@Component
public interface IPatientRepo extends JpaRepository<Patient, Integer> {

}
