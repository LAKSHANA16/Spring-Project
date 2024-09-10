package com.dto;

public class InventoryDto {
	private int inventoryId;
	private int productProductId;
	private int quantityInStock;
	private int lastStockUpdate;
	private String name;
	private String description;
	private double price;
	public InventoryDto() {
		// TODO Auto-generated constructor stub
	}
	public InventoryDto(int inventoryId, int productProductId, int quantityInStock, int lastStockUpdate, String name,
			String description, double price) {
		super();
		this.inventoryId = inventoryId;
		this.productProductId = productProductId;
		this.quantityInStock = quantityInStock;
		this.lastStockUpdate = lastStockUpdate;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public int getProductProductId() {
		return productProductId;
	}
	public void setProductProductId(int productProductId) {
		this.productProductId = productProductId;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public int getLastStockUpdate() {
		return lastStockUpdate;
	}
	public void setLastStockUpdate(int lastStockUpdate) {
		this.lastStockUpdate = lastStockUpdate;
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
		return "InventoryDto [inventoryId=" + inventoryId + ", productProductId=" + productProductId
				+ ", quantityInStock=" + quantityInStock + ", lastStockUpdate=" + lastStockUpdate + ", name=" + name
				+ ", description=" + description + ", price=" + price + "]";
	}
	
}
