package com.model;

public class Employee {
	
	    private String name;
	    private int age;
	    private String designation;
	    private String department;
	    private String manager;
		public Employee(String name, int age, String designation, String department, String manager) {
			super();
			this.name = name;
			this.age = age;
			this.designation = designation;
			this.department = department;
			this.manager = manager;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", designation=" + designation + ", department="
					+ department + ", manager=" + manager + "]";
		}
		
	    // Constructors, getters, and setters
	}

