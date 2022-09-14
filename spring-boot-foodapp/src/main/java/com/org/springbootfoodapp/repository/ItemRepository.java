package com.org.springbootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootfoodapp.dto.ItemDto;


public interface ItemRepository  extends JpaRepository<ItemDto ,Integer>{

}
