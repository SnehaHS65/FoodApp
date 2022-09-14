package com.org.springbootfoodapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootfoodapp.dto.User;
import com.org.springbootfoodapp.responseStructure.ResponseStructure;
import com.org.springbootfoodapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	

	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}


}
