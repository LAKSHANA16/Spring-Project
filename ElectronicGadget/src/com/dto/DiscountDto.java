package com.dto;

public class DiscountDto {
private int ordersId;
private int discount;
private int quantity;
private double totalAmount;
public DiscountDto() {	// TODO Auto-generated constructor stub
}
public DiscountDto(int ordersId, int discount, int quantity, double totalAmount) {
	super();
	this.ordersId = ordersId;
	this.discount = discount;
	this.quantity = quantity;
	this.totalAmount = totalAmount;
}
public int getOrdersId() {
	return ordersId;
}
public void setOrdersId(int ordersId) {
	this.ordersId = ordersId;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
@Override
public String toString() {
	return "DiscountDto [ordersId=" + ordersId + ", discount=" + discount + ", quantity=" + quantity + ", totalAmount="
			+ totalAmount + "]";
}

}
