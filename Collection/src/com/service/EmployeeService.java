package com.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dao.EmployeeDaoImpl;
import com.model.Employee;
public class EmployeeService {
EmployeeDaoImpl employeedao=new EmployeeDaoImpl();
public List<Employee> fetchAllEmployee(){
	List<Employee>list=employeedao.fetchEmployees();
	return list;
}
public void deleteEmployee(String name)
{
	employeedao.deleteEmployee(name);
}
public void updateEmployee(String ename,String edesc,double eprice)
{
	employeedao.updateEmployee(ename, edesc, eprice);
}
public List<Employee> orderRecords(List<Employee> list,String order)
{
	A a=new A();
	Collections.sort(list,a);
	return list;
}
}

class A implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getPrice()>e2.getPrice())
		return 1;
		if(e1.getPrice()<e2.getPrice())
			return -1;
		return 0;
	}
	
}
