package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	
	@Autowired
	private CustomerService myService;
	
	@RequestMapping
	public List<Customer> list() {
		return myService.findAll();
	}

	@RequestMapping("/{id}")
	public Customer user(@PathVariable int id) {
		return myService.findOne(id);
	}
	
}
