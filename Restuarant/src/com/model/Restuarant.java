
	package com.model;

	public class Restuarant {
	private int id;
	private String name;
	private String cuisine;
	private int noOfOrdered;
	private double pricePer;
	private String dessert;
	private double dessertCost;
	public Restuarant() {}
	public Restuarant(int id, String name, String cuisine, int noOfOrdered, double pricePer, String dessert,
			double dessertCost) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.noOfOrdered = noOfOrdered;
		this.pricePer = pricePer;
		this.dessert = dessert;
		this.dessertCost = dessertCost;
	}
	public Restuarant(String name, String cuisine, int noOfOrdered, double pricePer, String dessert, double dessertCost) {
		super();
		this.name = name;
		this.cuisine = cuisine;
		this.noOfOrdered = noOfOrdered;
		this.pricePer = pricePer;
		this.dessert = dessert;
		this.dessertCost = dessertCost;
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
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	public double getDessertCost() {
		return dessertCost;
	}
	public void setDessertCost(double dessertCost) {
		this.dessertCost = dessertCost;
	}
	@Override
	public String toString() {
		return "Restuarant [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", noOfOrdered=" + noOfOrdered
				+ ", pricePer=" + pricePer + ", dessert=" + dessert + ", dessertCost=" + dessertCost + "]";
	}

	}


