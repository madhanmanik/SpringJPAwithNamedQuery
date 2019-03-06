package com.uae.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uae.model.Customer;

@Service
public class BankServiceImpl {

	   @Autowired
	    private BankRepository bankRepository;

	    public List<String> getAllDetails(Customer customer) {
	        List<String> result = new ArrayList<String>();
	        List<Customer> players = bankRepository.fetchByAllData(5);
	     //   Customer value =  bankRepository.findById(1);
	        System.out.println("----->" +players);
	        
	        bankRepository.save(customer);
	        
	        for (Customer player : bankRepository.findAll()) {
	            result.add(player.getName());
	        }
	        return result;
	    }
	    
}
