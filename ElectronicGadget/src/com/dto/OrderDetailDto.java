package com.dto;

public class OrderDetailDto {
private int orders_id;
private int subtotal;
public OrderDetailDto() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderDetailDto(int orders_id, int subtotal) {
	super();
	this.orders_id = orders_id;
	this.subtotal = subtotal;
}
public int getOrders_id() {
	return orders_id;
}
public void setOrders_id(int orders_id) {
	this.orders_id = orders_id;
}
public int getSubtotal() {
	return subtotal;
}
public void setSubtotal(int subtotal) {
	this.subtotal = subtotal;
}
@Override
public String toString() {
	return "OrderDetailDto [orders_id=" + orders_id + ", subtotal=" + subtotal + "]";
}

}
