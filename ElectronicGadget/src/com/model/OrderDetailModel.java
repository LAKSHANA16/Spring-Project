package com.model;

public class OrderDetailModel {
private int ordersDetailId;
private int ordersOrdersId;
private int productProductId;
private int quantity;
public OrderDetailModel() {}
public OrderDetailModel(int ordersDetailId, int ordersOrdersId, int productProductId, int quantity) {
	super();
	this.ordersDetailId = ordersDetailId;
	this.ordersOrdersId = ordersOrdersId;
	this.productProductId = productProductId;
	this.quantity = quantity;
}
public int getOrdersDetailId() {
	return ordersDetailId;
}
public void setOrdersDetailId(int ordersDetailId) {
	this.ordersDetailId = ordersDetailId;
}
public int getOrdersOrdersId() {
	return ordersOrdersId;
}
public void setOrdersOrdersId(int ordersOrdersId) {
	this.ordersOrdersId = ordersOrdersId;
}
public int getProductProductId() {
	return productProductId;
}
public void setProductProductId(int productProductId) {
	this.productProductId = productProductId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "OrderDetailModel [ordersDetailId=" + ordersDetailId + ", ordersOrdersId=" + ordersOrdersId
			+ ", productProductId=" + productProductId + ", quantity=" + quantity + "]";
}

}
