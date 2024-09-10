package com.dto;

public class RestuarantDto {
private int id;
private String name;
private String cuisine;
private int noOfOrdered;
private double pricePer;
private double totalCost;
public RestuarantDto() {}
public RestuarantDto(int id, String name, String cuisine, int noOfOrdered, double pricePer, double totalCost) {
	super();
	this.id = id;
	this.name = name;
	this.cuisine = cuisine;
	this.noOfOrdered = noOfOrdered;
	this.pricePer = pricePer;
	this.totalCost = totalCost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
public int getNoOfOrdered() {
	return noOfOrdered;
}
public void setNoOfOrdered(int noOfOrdered) {
	this.noOfOrdered = noOfOrdered;
}
public double getPricePer() {
	return pricePer;
}
public void setPricePer(double pricePer) {
	this.pricePer = pricePer;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
@Override
public String toString() {
	return "RestuarantDto [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", noOfOrdered=" + noOfOrdered
			+ ", pricePer=" + pricePer + ", totalCost=" + totalCost + "]";
}

}
