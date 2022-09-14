package com.org.springbootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootfoodapp.dto.FoodProduct;
import com.org.springbootfoodapp.repository.FoodProductsRepository;



@Repository
public class FoodProductDao {
	@Autowired
	FoodProductsRepository foodProductsRepository;
	
	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		return foodProductsRepository.save(foodProduct);
	}
	
	public Optional<FoodProduct> getbyId(int id){
		return foodProductsRepository.findById(id);
	}
	
	public FoodProduct delete(int id) {
		FoodProduct foodProduct=getbyId(id).get();
		foodProductsRepository.delete(foodProduct);
		return foodProduct;
	}
	public FoodProduct update(FoodProduct foodProduct, int id) {
		foodProduct.setId(id);
		return foodProductsRepository.save(foodProduct);
	}
	public List<FoodProduct> getall(){
		return foodProductsRepository.findAll();
	}

}
