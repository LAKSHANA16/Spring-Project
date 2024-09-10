package com.model;

public class EmployeeModel {
String name;
int age;
String designation;
String department;
String manager;

public EmployeeModel()
{
	this.age=age;
	this.name=name;
	this.department=department;
	this.designation=designation;
	this.manager=manager;
}

public EmployeeModel(String name, int age, String designation, String department, String manager) {
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


}
