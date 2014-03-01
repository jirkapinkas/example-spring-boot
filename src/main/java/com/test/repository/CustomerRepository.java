package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
