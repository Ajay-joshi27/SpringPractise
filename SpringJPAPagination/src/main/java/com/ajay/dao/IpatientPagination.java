package com.ajay.dao;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.ajay.Entity.Patient;

public interface IpatientPagination extends ListPagingAndSortingRepository<Patient, Integer> {

}
