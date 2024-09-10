package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.Student1;
import com.service.Student1Service;

public class Student1Controller {
public static void main(String args[])
{
	Student1Service  student1Service=new Student1Service();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("********************OPS********************");
	System.out.println("ENTER 1 TO FETCH");
	System.out.println("ENTER 2 TO UPDATE");
	System.out.println("ENTER 3 TO DELETE");
	System.out.println("ENTER 0 TO EXIT");
	int input=sc.nextInt();
	
	if(input==0)
	{
		System.out.println("EXITING.......THANK YOU!!!!");
		break;
	}
	switch(input)
	{
	case 1:
		System.out.println("FETCH ALL DETAILS");
		List<Student1>list=student1Service.fetchAll();
		for(Student1 s:list)
		{
			System.out.println(s.getStudentId()+"\t"+s.getFirstName()+"\t"+s.getLastName()+"\t"
					+s.getDob()+"\t"+s.getEmail()+"\t"+s.getPhoneNumber());
		}
		break;
	case 2:
		System.out.println("UPDATE");
		break;
		default:
			System.out.println("INVALID INPUT");
			break;
	}
}
	
}
}
