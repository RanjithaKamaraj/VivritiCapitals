package org.vivriticapitals.grocerymanagement.service;

import java.util.List;
import java.util.Map;

import org.vivriticapitals.grocerymanagement.models.Customer;

public class CustomerService {
	private Map<String,Customer> customers;
	public void batchCreateCustomers(List<Customer> customers) {}
	public Customer getCustomer(Long customerId) {return new Customer();}
}
