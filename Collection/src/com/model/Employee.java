package com.model;

public class Employee {
	
		//ENCAPSULATION
		/*constructor,getter and setter,toString*/
		
	    private String name;
	    private String description;
	    private double price;
	    public Employee()
	    {
	    
	    }
		public Employee(String name, String description, double price) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
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
			return "Employee [name=" + name + ", description=" + description + ", price=" + price + "]";
		}
		
		}
		 
		
		
	    
	


