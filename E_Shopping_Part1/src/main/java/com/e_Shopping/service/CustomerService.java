package com.e_Shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_Shopping.connectionRepository.CustomerRepository;
import com.e_Shopping.model.CustomerDetails;


@Service
public class CustomerService 	{

	@Autowired
	CustomerRepository customerRepository;

	public CustomerDetails addData(CustomerDetails details) {
	
		CustomerDetails save = customerRepository.save(details);
		return save;
		
	}

	public String verify(String email, String password) {
		System.out.println("Email : "+email + "Password : "+password);
		List<CustomerDetails> result = customerRepository.findByEmailAndPassword(email, password);
		if(!result.isEmpty())
		{
			return "Login successful";
		}
		return "Login Failed";
		
		
	}
	
	
}
