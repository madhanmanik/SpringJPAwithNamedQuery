package com.uae.service;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uae.model.Customer;


@Repository
public interface BankRepository extends CrudRepository<Customer, Long> {

	//Customer findById(int i);

	//@Query("select u from xremit.dbo.customer u")
	List<Customer> fetchByAllData(@Param("id") int length);
	
	
}