package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.Admin;



public interface AdminRepository extends JpaRepository<Admin, Integer>  {

}
