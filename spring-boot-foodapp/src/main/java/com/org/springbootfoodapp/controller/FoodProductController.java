package com.org.springbootfoodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootfoodapp.dto.FoodProduct;
import com.org.springbootfoodapp.responseStructure.ResponseStructure;
import com.org.springbootfoodapp.service.FoodProductService;

@RestController
public class FoodProductController {
	
	@Autowired
	FoodProductService foodProductService;
	
	@PostMapping("/foodproduct")
	public ResponseEntity<ResponseStructure<FoodProduct>> saveFoodProduct(@RequestBody FoodProduct foodProduct){
		return foodProductService.savefFoodProduct(foodProduct, 2);
	}

}