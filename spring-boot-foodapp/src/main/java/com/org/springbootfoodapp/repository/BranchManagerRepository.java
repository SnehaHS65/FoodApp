package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.BranchManager;



public interface BranchManagerRepository extends JpaRepository<BranchManager, Integer>{

}
