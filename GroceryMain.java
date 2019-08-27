package org.vivriticapitals.grocerymanagement;

import java.util.Scanner;

import org.vivriticapitals.grocerymanagement.service.InventoryService;
import org.vivriticapitals.grocerymanagement.service.ItemService;
import org.vivriticapitals.grocerymanagement.service.CustomerService;
import org.vivriticapitals.grocerymanagement.service.GroceryService;
import org.vivriticapitals.grocerymanagement.service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroceryMain {
	private static InventoryService inventoryService;
	private static ItemService itemService;
	private static UserService userService;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		
		do
		{
			System.out.println("Please enter 1 for Retailer 2 for User");
			int choice1 = Integer.parseInt(br.readLine());
				System.out.println("Please enter to continue operation");
				System.out.println("1. To enter Grocery Details");
				System.out.println("2. To enter User Details");
				System.out.println("3. To display current stock details");
				System.out.println("4. To order items");
				System.out.println("5. To get bill");
				int choice = Integer.parseInt(br.readLine());
				switch(choice)
				{
					case 1:
						getGroceryDetails(br);
						break;
					case 2:
						getUserDetails(br);
						break;
					case 3:
						if(inventoryService==null)
						{
							System.out.println("Inventory not initialized");
							break;
						}
						inventoryService.displayCurrentStock();
				}
				System.out.println("Please enter Y to continue operation");
				ch= (char)br.read();
			}while (ch == 'Y'|| ch == 'y');
	}
	private static void getUserDetails(BufferedReader br)throws IOException {
		System.out.println("Please enter User Details");
		System.out.println("Please enter Name");
		String userName = br.readLine();
		System.out.println("Please enter Contact Number");
		String userContactNumber = br.readLine();
		System.out.println("Please enter address");
		String userAddress = br.readLine();
		System.out.println("Please enter age");
		int age = Integer.parseInt(br.readLine());
		if(userService==null)
		{
			userService=new UserService();
		}
		userService.createUser(userName,userContactNumber,userAddress,age);	
	}
	private static void getGroceryDetails(BufferedReader br) throws IOException
	{
		System.out.println("Please enter Grocery Details");
        System.out.println("Please enter Grocery Name");
        String groceryName = br.readLine();
        System.out.println("Please enter Grocery Contact Numbers");
        String groceryContactNumber = br.readLine();
        System.out.println("Please enter Grocery address");
        String groceryAddress = br.readLine();
        System.out.println("Please enter Grocery Register count");
        int registerCount=Integer.parseInt(br.readLine());
        if(itemService==null)
        {
        itemService=new ItemService();
        }
        char ch1;
		do {
        System.out.println("Please enter Item details in grocery");
        String itemName="";
        float listPrice=0.0f;
        float ourPrice = 0.0f;
        int quantity;
        itemService.createItem(itemName, listPrice, ourPrice);
        System.out.println("Please enter Y to continue operation");
        ch1=(char)br.read();
        }while(ch1=='Y');
	}
}