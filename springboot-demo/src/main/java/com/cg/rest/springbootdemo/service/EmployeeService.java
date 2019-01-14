package com.cg.rest.springbootdemo.service;

import java.util.List;

import com.cg.rest.springbootdemo.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
}
