package com.model;

public class ProductModel {
private int productId;
private String name;
private String description;
private double price;
public ProductModel() {}
public ProductModel(int productId, String name, String description, double price) {
	super();
	this.productId = productId;
	this.name = name;
	this.description = description;
	this.price = price;
}
public ProductModel(String name, String description, double price) {
	super();
	this.name = name;
	this.description = description;
	this.price = price;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "ProductModel [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
			+ price + "]";
}

}
