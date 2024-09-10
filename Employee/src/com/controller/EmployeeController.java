package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.model.EmployeeModel;
import com.service.EmployeeService;

public class EmployeeController {
public static void main(String args[])
{
	EmployeeService service=new EmployeeService();
	((EmployeeModel) service).setName("Alice");
}
}
