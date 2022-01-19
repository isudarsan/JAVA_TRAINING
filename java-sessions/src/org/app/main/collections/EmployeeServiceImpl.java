package org.app.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void create(Employee employee) {
		employees.add(employee);

	}

	@Override
	public List<Employee> getAll() {
		return employees;
	}

	@Override
	public Employee findBy(int id) {

		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {

			Employee emp = it.next();

			if (id == emp.getId()) {
				return emp;

			}
		}

		return null;

	}

	@Override
	public void delete(int id) {

		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {

			Employee emp = it.next();

			if (id == emp.getId()) {
				employees.remove(emp);

			}
		}

	}

	@Override
	public void update(Employee employee) {

	}

}
