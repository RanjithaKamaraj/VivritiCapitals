package org.vivriticapitals.grocerymanagement.service;

import java.util.Map;

import org.vivriticapitals.grocerymanagement.models.User;

public class UserService {
	private Map<String,User> users;
	public User createUser(String name,String phoneNumber,String address,int age) {
		return new User(name,phoneNumber,address,age);
	}
}
