package com.model;

import java.time.LocalDate;

public class OrdersModel {
private int ordersId;
private int customerCustomerId;
private LocalDate orderDate;
private double totalAmount;
public OrdersModel() {
// TODO Auto-generated constructor stub
}
public OrdersModel(int ordersId, int customerCustomerId, LocalDate orderDate, double totalAmount) {
	super();
	this.ordersId = ordersId;
	this.customerCustomerId = customerCustomerId;
	this.orderDate = orderDate;
	this.totalAmount = totalAmount;
}
public int getOrdersId() {
	return ordersId;
}
public void setOrdersId(int ordersId) {
	this.ordersId = ordersId;
}
public int getCustomerCustomerId() {
	return customerCustomerId;
}
public void setCustomerCustomerId(int customerCustomerId) {
	this.customerCustomerId = customerCustomerId;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
@Override
public String toString() {
	return "OrdersModel [ordersId=" + ordersId + ", customerCustomerId=" + customerCustomerId + ", orderDate="
			+ orderDate + ", totalAmount=" + totalAmount + "]";
}

}
