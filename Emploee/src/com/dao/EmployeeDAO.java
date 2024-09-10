package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	List<Employee> getAllEmployees();
    Employee getEmployeeByName(String name);
    List<Employee> getEmployeesByManagerAndDepartment(String managerName, String department);
    void addEmployee(Employee employee);
}
