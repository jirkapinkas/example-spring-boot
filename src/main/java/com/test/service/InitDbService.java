package com.test.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;
import com.test.repository.CustomerRepository;

@Service
public class InitDbService {

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void init() {
		{
			Customer customer = new Customer();
			customer.setName("Jirka");
			customerRepository.save(customer);
		}
		{
			Customer customer = new Customer();
			customer.setName("Michal");
			customerRepository.save(customer);
		}
	}
}
