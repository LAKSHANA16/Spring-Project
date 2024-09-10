package com.hexaware.spring;

public class HelloImpl implements Hello{

	String name;
	String city;
	int age;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void Disp() {
		// TODO Auto-generated method stub
		System.out.println("Hi "+name);
		System.out.println("Welcome to "+city);
		System.out.println("Your age "+age);
		
	}

}
