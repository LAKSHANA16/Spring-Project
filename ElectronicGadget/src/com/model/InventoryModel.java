package com.model;

public class InventoryModel {
	private int inventoryId;
	private int productProductId;
	private int quantityInStock;
	private int lastStockUpdate;
	public InventoryModel() {}
	public InventoryModel(int inventoryId, int productProductId, int quantityInStock, int lastStockUpdate) {
		super();
		this.inventoryId = inventoryId;
		this.productProductId = productProductId;
		this.quantityInStock = quantityInStock;
		this.lastStockUpdate = lastStockUpdate;
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
	@Override
	public String toString() {
		return "InventoryModel [inventoryId=" + inventoryId + ", productProductId=" + productProductId
				+ ", quantityInStock=" + quantityInStock + ", lastStockUpdate=" + lastStockUpdate + "]";
	}
	
}
