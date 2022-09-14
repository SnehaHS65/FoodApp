package com.org.springbootfoodapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MenuDto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    
    private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	


}
