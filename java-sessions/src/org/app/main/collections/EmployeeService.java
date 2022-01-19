package org.app.main.collections;

import java.util.List;


// CRUD

// C - Create, R - Read, U - Update, D - Delete
public interface EmployeeService {

	void create(Employee employee);
	
	List<Employee> getAll();
	
	Employee findBy(int id);
	
	void delete(int id);
	
	void update(Employee employee);
	
}
