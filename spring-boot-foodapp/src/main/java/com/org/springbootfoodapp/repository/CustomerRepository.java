package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
