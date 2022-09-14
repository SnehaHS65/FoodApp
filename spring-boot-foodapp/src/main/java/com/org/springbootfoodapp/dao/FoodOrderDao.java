package com.org.springbootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootfoodapp.dto.FoodOrder;
import com.org.springbootfoodapp.repository.FoodOrderRepository;

@Repository
public class FoodOrderDao {
	
		@Autowired
		private FoodOrderRepository foodOrderRepository;
	
		public FoodOrder saveorders(FoodOrder orders) {
			return foodOrderRepository.save(orders);
		}
		public Optional<FoodOrder> getbyId(int id) {
			return foodOrderRepository.findById(id);
		}
		public FoodOrder delete(int id) {
			FoodOrder orders=getbyId(id).get();
			foodOrderRepository.delete(orders);
			return orders;
		}
		public FoodOrder update(FoodOrder orders, int id) {
			orders.setId(id);
			return foodOrderRepository.save(orders);
		}
		public List<FoodOrder> getall(){
			return foodOrderRepository.findAll();
		}
}
