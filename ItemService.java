package org.vivriticapitals.grocerymanagement.service;

import java.util.List;
import java.util.Map;

import org.vivriticapitals.grocerymanagement.models.Item;

public class ItemService {
	private Map<String,Item> items;
	//public void batchCreateItem(List<Item> items) {}
	public Item getItem(String name) {return items.get(name);}
	public Item createItem(String name,float listPrice,float ourPrice) {
		if(items.containsKey(name))
		{
			return items.get(name);
		}
		return new Item(name,listPrice,ourPrice);
	}
}
