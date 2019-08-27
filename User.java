package org.vivriticapitals.grocerymanagement.models;

import java.util.UUID;

public class User {
	
	private String name;
	private String phoneNumber;
	private String address;
	private int age;
	private String userId;
	public void isSeniorCitizen(){}		
	public User(String name,String phoneNumber,String address, int age) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.age=age;
		this.userId=UUID.randomUUID().toString();
	}
}