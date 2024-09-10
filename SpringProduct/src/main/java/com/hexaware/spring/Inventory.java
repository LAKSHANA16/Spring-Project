package com.hexaware.spring;

import java.util.List;


public class Inventory {
int quantityavail;
List<Order>items;

public int getQuantityavail() {
	return quantityavail;
}
public void setQuantityavail(int quantityavail) {
	this.quantityavail = quantityavail;
}
public List<Order> getItems() {
	return items;
}
public void setItems(List<Order> items) {
	this.items = items;
}
public void displayInfo() {
	System.out.println("the quantity vaialable:"+getQuantityavail());
	for (Order order : items) {
		System.out.println(order);
		int diff =getQuantityavail() - order.getProduct().getQuantity();
		if (diff < order.getProduct().getQuantity()) {
			System.out.println("Insufficient Quantity...");
		} else {
			System.out.println("Total Bill Amount  " +order.getProduct().getPrice() * order.getProduct().getQuantity());
		}
	}
}


}
