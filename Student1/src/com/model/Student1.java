package com.model;

import java.sql.Date;


public class Student1 {
private int studentId;
private String firstName;
private String lastName;
private Date dob;
private String email;
private String phoneNumber;
public Student1() {}
public Student1(int studentId, String firstName, String lastName, Date dob, String email, String phoneNumber) {
	super();
	this.studentId = studentId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
public Student1(String firstName, String lastName, Date dob, String email, String phoneNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
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
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Student1 [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
			+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
}



}
