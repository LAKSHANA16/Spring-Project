package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	List<Employee>employees = new ArrayList<>();
	 public EmployeeDAOImpl() {
	        // Initialize employees (mock data)
		    employees.add(new Employee("Alice", 32, "Manager", "IT", " "));
	        employees.add(new Employee("John Doe", 30, "Tester", "IT", "Alice"));
	        employees.add(new Employee("Jane Smith", 28, "Developer", "IT", "Alice"));
	        // Add more employees as needed
	    }
	 public void addEmployee(Employee employee) {
	        employees.add(employee);
	    }
	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}


	public Employee getEmployeeByName(String name) {
		for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                return emp;
            }
        }
        return null;
	}


	public List<Employee> getEmployeesByManagerAndDepartment(String managerName, String department) {
		List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getManager().equalsIgnoreCase(managerName) && emp.getDepartment().equalsIgnoreCase(department)) {
                result.add(emp);
            }
        }
        return result;
	}

}
