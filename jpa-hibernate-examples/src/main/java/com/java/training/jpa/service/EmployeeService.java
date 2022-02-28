package com.java.training.jpa.service;

import com.java.training.jpa.entity.Employee;

public interface EmployeeService {

	void create(final Employee employee);

	Employee findBy(final int employeeId);

	void delete(final int employeeId);

	void update(final Employee employee);

}
