package com.service;

import java.util.List;

import com.dao.EmployeeDAOImpl;
import com.model.Employee;

public class EmployeeService {
EmployeeDAOImpl daoimpl=new EmployeeDAOImpl();
public void addEmployee(Employee employee) {
	daoimpl.addEmployee(employee);
}
public List<Employee> getAllEmployees() {
    return daoimpl.getAllEmployees();
}

public Employee getEmployeeByName(String name) {
    return daoimpl.getEmployeeByName(name);
}

public List<Employee> getEmployeesByManagerAndDepartment(String managerName, String department) {
    return daoimpl.getEmployeesByManagerAndDepartment(managerName, department);
}
}
