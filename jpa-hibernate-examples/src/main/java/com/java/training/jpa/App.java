package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Employee;
import com.java.training.jpa.service.EmployeeService;
import com.java.training.jpa.service.impl.EmployeeServiceImpl;
import com.java.training.jpa.util.JPAUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();

		// Create Employee

//		Employee employee = new Employee();
//		employee.setEmployeeId(1236);
//		employee.setFirstName("JPA FirstName2");
//		employee.setLastName("JPA Last Name2");
//		employee.setAge(61);
//		employee.setSalary(110.67);
//
//		employeeService.create(employee);
//		
//		System.out.println("Employee Inserted");

		// Find Employee by PK

//		Employee employee = employeeService.findBy(111);
//
//		if (null == employee) {
//			System.out.println("Record doesnt exists!");
//		} else {
//			System.out.println(employee);
//		}

		// Delete Employee
		// employeeService.delete(11);

		
		// Update Employee
		Employee employee = new Employee();
		employee.setEmployeeId(105);
		employee.setFirstName("XXX_Updated First Name");
		employee.setLastName("XXX_Updated Last Name");
		employee.setAge(6);
		employee.setSalary(67);

		employeeService.update(employee);

	}
}
