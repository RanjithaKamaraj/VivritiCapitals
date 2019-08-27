package org.vivriticapitals.grocerymanagement.models;
import java.util.UUID;

public class Item {
	private String name;
	private float listPrice;
	private float ourPrice;
	private String uuid;
	public Item(String name,float listPrice,float ourPrice) {
		this.name=name;
		this.listPrice=listPrice;
		this.ourPrice=ourPrice;
		this.uuid=UUID.randomUUID().toString();
	}
}
