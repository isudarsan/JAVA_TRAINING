package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Employee;
import com.java.training.jpa.entity.Test;
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

		for (int i = 1; i <= 100; i++) {

			Employee employee = new Employee(i+1, "First Name " + i, "Last name " + i, 8 + i, 1000 + i);

			employeeService.create(employee);
		}

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

//		Employee employee = employeeService.findBy(2);
//
//		if (null == employee) {
//			System.out.println("Record doesnt exists!");
//		} else {
//			System.out.println(employee);
//		}

		// Delete Employee
		// employeeService.delete(11);

		// Update Employee
//		Employee employee = new Employee();
//		employee.setEmployeeId(105);
//		employee.setFirstName("XXX_Updated First Name");
//		employee.setLastName("XXX_Updated Last Name");
//		employee.setAge(6);
//		employee.setSalary(67);
//
//		employeeService.update(employee);

		// System.out.println(employeeService.getAllUsingJPQL());

		// System.out.println(employeeService.getCountOfAllRecords());

		// System.out.println(employeeService.getFirstNameBasedOnLastNameAndAge("CC",35));

		// System.out.println(employeeService.getAllUsingJPQLUsingNamedQuery());

		// System.out.println(employeeService.getAllByAge(25));

		// System.out.println(employeeService.getAllUsingNamedNativeQuery());

		// For hbm2ddl demo purpose.

//		Test test = new Test();
//		test.setEmployeeId(1);
//		test.setFirstName("JPA FirstName2");
//		test.setLastName("JPA Last Name2");
//		test.setAge(61);
//		test.setSalary(110.67);
//		
//		
//		EntityManagerFactory emf = JPAUtil.getEMF();
//		EntityManager em = emf.createEntityManager();
//
//		em.getTransaction().begin();
//
//		// Used to insert the data into the database.
//		// INSERT INTO query
//		em.persist(test);
//
//		em.getTransaction().commit();
//
//		em.close();
//
//		JPAUtil.close();

	}
}
