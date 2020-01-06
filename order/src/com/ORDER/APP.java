package com.ORDER;

import java.util.Map;
import java.util.TreeMap;

public class APP {
	static Map customerMap = new TreeMap<Integer, Customer>();
	public static void main(String[] args) {
		try {
			Customer customer = new Customer(1,"Ravi",1,"Roll","Special",2);
			addCustomer(customer);
			findCustomer(1);
			
			Customer updatedCustomer = new Customer(1,"Chita",2,"Roll","Normal",4);
			updateCustomer(updatedCustomer);
			
			Customer updatedCustomer1 = new Customer(1,"Arunesh",3,"Burger","Special",3);
			updateCustomer(updatedCustomer1);
			
			deleteCustomer(2);
	
		}
		 catch (OrderException customerException) {
				System.out.println(customerException);
			}
	}
	private static void addCustomer(Customer customer) {
		try {
		customerMap.put(customer.customerId, customer);
		System.out.println("Order Added Successfully!");
		} catch (OrderException customerException) {
			System.out.println("Unable to add Order!");
		}
		
		
	}
	private static void findCustomer(int customerId) {
		Customer customer = (Customer)customerMap.get(customerId);
		if(customer != null) {
			System.out.println("Found Order : " + customer);
		}
		else {
			System.out.println("Order not found!");
		}
	}

	private static void updateCustomer(Customer customer) {
		Customer customer1 = (Customer)customerMap.get(customer.customerId);
		if(customer1 != null) {
			customerMap.put(customer.customerId, customer);
			System.out.println("Updated Order : " + customer);
		}
		else {
			System.out.println("Order not found!");
		}
	}
	private static void deleteCustomer(int customerId) {
		Customer customer = (Customer)customerMap.get(customerId);
		if(customer != null) {
			customerMap.remove(customerId);
			System.out.println("Order Deleted");
			System.out.println(customerMap);
		}
		else {
			System.out.println("Order not found!");
		}
	}
}