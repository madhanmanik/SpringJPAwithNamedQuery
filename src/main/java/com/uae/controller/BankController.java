package com.uae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uae.model.Customer;
import com.uae.service.BankServiceImpl;

@RestController
@RequestMapping("/bank")
public class BankController {

	 @Autowired
	 BankServiceImpl bankServiceImpl;
	 
	
	@PostMapping("/save")
	public void putData(@RequestBody Customer customer)
	{
		 List<String> players = bankServiceImpl.getAllDetails(customer);
	        for(String player : players)
	        {
	            System.out.println("Introducing Barca player => " + player);
	        }
	}
	
	/*SELECT * FROM xremit.dbo.customer

DROP TABLE xremit.dbo.customer
insert into xremit.dbo.customer (id, name,email) values(1,'Lionel Messi', 'madhanmanik@gmail.com')
	insert into xremit.dbo.customer (id, name,email) values(2,'Andreas Inniesta','Midfielder')
	insert into xremit.dbo.customer (id, name,email) values(3,'Pique','Defender')*/
	
}
