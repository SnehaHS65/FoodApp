package com.org.springbootfoodapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootfoodapp.dto.FoodOrder;
import com.org.springbootfoodapp.repository.FoodOrderRepository;

@Repository
public class FoodOrderDao {
	
	@Autowired
	FoodOrderRepository foodOrderRepository;
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
	}

}