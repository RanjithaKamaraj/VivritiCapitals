package org.vivriticapitals.grocerymanagement.models;
import java.util.Map;
import java.util.Date;

public class Transaction {
	private Customer customer;
	private Map<String,Integer> Item;
	private float totalAmount;
	private float amountReceivedFromCustomer;
	private Date currentDateTime;
	public void addItem(String itemId,Integer quantity) {}
	public void removeItem(String itemId,Integer quantity) {}
	public void generateBill() {}
	public void getAmountFromCustomer() {}
	public void calculateChange() {}
}

