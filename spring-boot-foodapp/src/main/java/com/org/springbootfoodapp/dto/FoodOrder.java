package com.org.springbootfoodapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String status;
	private double totalPrice;
	private String orderCreatedTime;
	private String orderDeliveryTime;
	private String customerName;
	private String contactNumber;

	private User user;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderCreatedTime() {
		return orderCreatedTime;
	}
	public void setOrderCreatedTime(String orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}
	public String getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(String orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public User getUser() {
		User user = null;
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	

}
