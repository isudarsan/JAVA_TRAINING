package org.app.service;

import org.app.model.Employee;

public interface EmployeeService {

	
	void create(Employee employee);
	
	Employee[] getAll();
	
	Employee findBy(int id);
	
	Employee findBy(String name);
}
