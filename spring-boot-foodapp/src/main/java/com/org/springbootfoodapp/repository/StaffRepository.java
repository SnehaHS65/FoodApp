package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.Staff;



public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
