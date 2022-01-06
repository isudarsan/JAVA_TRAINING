package org.app.service.impl;

import org.app.model.Employee;
import org.app.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeServiceImpl EMPLOYEE_SERVICEIMPL = new EmployeeServiceImpl();

	private EmployeeServiceImpl() {

	}

	public static EmployeeService getInstance() {
		return EMPLOYEE_SERVICEIMPL;
	}

	@Override
	public void create(Employee employee) {

		//
	}

	@Override
	public Employee[] getAll() {
		//
		return null;
	}

	@Override
	public Employee findBy(int id) {
		//
		return null;
	}

	@Override
	public Employee findBy(String name) {
		//
		return null;
	}

}
