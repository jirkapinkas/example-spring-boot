package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;
import com.test.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer findOne(int id) {
		return customerRepository.findOne(id);
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
