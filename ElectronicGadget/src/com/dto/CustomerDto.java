package com.dto;

import java.time.LocalDate;

public class CustomerDto {
private int customer_id;
private String firstName;
private String lastName;
private int total;
public CustomerDto() {}
public CustomerDto(int customer_id, String firstName, String lastName, int total) {
	super();
	this.customer_id = customer_id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.total = total;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
@Override
public String toString() {
	return "CustomerDto [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", total=" + total + "]";
}


}
