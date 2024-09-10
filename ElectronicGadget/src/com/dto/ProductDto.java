package com.dto;

public class ProductDto {
private int productId;
private String name;
private int quantityInStock;
public ProductDto() {}
public ProductDto(int productId, String name, int quantityInStock) {
	super();
	this.productId = productId;
	this.name = name;
	this.quantityInStock = quantityInStock;
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
public int getQuantityInStock() {
	return quantityInStock;
}
public void setQuantityInStock(int quantityInStock) {
	this.quantityInStock = quantityInStock;
}
@Override
public String toString() {
	return "ProductDto [productId=" + productId + ", name=" + name + ", quantityInStock=" + quantityInStock + "]";
}

}
