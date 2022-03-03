package com.java.training.jpa.service;

import java.util.List;

import com.java.training.jpa.entity.Employee;

public interface EmployeeService {

	void create(final Employee employee);

	Employee findBy(final int employeeId);

	void delete(final int employeeId);

	void update(final Employee employee);
	
	List<Employee> getAllUsingJPQL();
	
	List<Employee> getAllUsingNativeQuery();
	
	List<Employee> getAllUsingNativeQueryWithOverloadedMethod();

	Long getCountOfAllRecords();
	
	List<String> getFirstNameBasedOnLastName(final String lastName);
	
	List<String> getFirstNameBasedOnLastNameAndAge(final String lastName, final int age);
	
	
	List<Employee> getAllUsingJPQLUsingNamedQuery();
	
	List<Employee> getAllByAge(final int age);
	
	List<Employee> getAllUsingNamedNativeQuery();
	
}
