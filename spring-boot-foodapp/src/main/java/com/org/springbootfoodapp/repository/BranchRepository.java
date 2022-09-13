package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.Branch;



public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
