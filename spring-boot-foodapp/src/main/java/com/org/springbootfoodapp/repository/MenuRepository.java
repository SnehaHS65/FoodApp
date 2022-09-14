package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.MenuDto;

public interface MenuRepository extends JpaRepository<MenuDto , Integer>{

}
