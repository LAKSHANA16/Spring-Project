package com.dto;

public class QuantityDto {
private int ordersId;
private int quantityInStock;
private int quantity;
private int productProductId;
public QuantityDto() {	// TODO Auto-generated constructor stub
}
public QuantityDto(int ordersId, int quantityInStock, int quantity, int productProductId) {
	super();
	this.ordersId = ordersId;
	this.quantityInStock = quantityInStock;
	this.quantity = quantity;
	this.productProductId = productProductId;
}
public int getOrdersId() {
	return ordersId;
}
public void setOrdersId(int ordersId) {
	this.ordersId = ordersId;
}
public int getQuantityInStock() {
	return quantityInStock;
}
public void setQuantityInStock(int quantityInStock) {
	this.quantityInStock = quantityInStock;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductProductId() {
	return productProductId;
}
public void setProductProductId(int productProductId) {
	this.productProductId = productProductId;
}
@Override
public String toString() {
	return "QuantityDto [ordersId=" + ordersId + ", quantityInStock=" + quantityInStock + ", quantity=" + quantity
			+ ", productProductId=" + productProductId + "]";
}

}
