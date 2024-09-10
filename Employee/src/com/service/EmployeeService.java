package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
EmployeeDao dao=new EmployeeDao();
public Object list;
public void dispDetails()
{
	dao.dispDetails();
}
}
