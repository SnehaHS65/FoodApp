package com.org.springbootfoodapp.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootfoodapp.dto.ItemDto;
import com.org.springbootfoodapp.repository.ItemRepository;

@Repository
public class ItemDao {
	
	@Autowired
	ItemRepository  itemRepository;
	
	public Item saveItem(Item  item) {
		return itemRepository.save(item);
		
	}
	
	

	
	
	

}
