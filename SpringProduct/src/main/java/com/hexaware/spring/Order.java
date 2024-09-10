package com.hexaware.spring;

public class Order {
int id;
Product product;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
@Override
public String toString() {
	return "Order [id=" + id + ", product=" + product + "]";
}

}
