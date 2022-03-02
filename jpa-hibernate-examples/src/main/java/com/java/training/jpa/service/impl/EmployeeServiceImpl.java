package com.java.training.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.java.training.jpa.entity.Employee;
import com.java.training.jpa.service.EmployeeService;
import com.java.training.jpa.util.JPAUtil;

public class EmployeeServiceImpl implements EmployeeService {

	public void create(Employee employee) {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Used to insert the data into the database.
		// INSERT INTO query
		em.persist(employee);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

	}

	public Employee findBy(int employeeId) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Transaction is not required to find an Entity using EntityManager, hence
		// commented.
		// em.getTransaction().begin();

		// SELECT * FROM EMPLOYEE WHERE employee_id = ?
		Employee employee = em.find(Employee.class, employeeId);

		// em.getTransaction().commit();

		em.close();
		JPAUtil.close();

		return employee;

	}

	public void delete(int employeeId) {

		// TODO Explian why the findMethod call throws Illegal Exception while
		// explaining Detached objects.

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee employee = em.find(Employee.class, employeeId);

		if (null == employee) {
			System.out.println("Record doesnt exists ! to delete");
		} else {

			System.out.println("Employee Found for Delete ");
			System.out.println(employee);

			// Remove method deletes the row in the table
			// Constructs delete query dynamically.
			em.remove(employee);

			em.getTransaction().commit();

			em.close();
			JPAUtil.close();

			System.out.println("Record Deleted !");

		}

	}

	public void update(Employee employee) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee employeeExisting = em.find(Employee.class, employee.getEmployeeId());

		if (null == employeeExisting) {
			System.out.println("Record doesnt exists ! to Update");
		} else {

			System.out.println("Employee Found for Updation ");
			System.out.println(employee);

			// merge method is used to update the data in the table
			// Constructs UPDATE query
			em.merge(employee);

			em.getTransaction().commit();

			em.close();
			JPAUtil.close();

			System.out.println("Record Updated !");

		}

	}

	public List<Employee> getAll() {

		// Transaction is not required when we are using JPA Query interface or finding
		// any entity using EntintManager
		// Transaction is required when we perform INSERT, UPDATE & DELETE operations.

		List<Employee> employees = null;

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// employees = new ArrayList<Employee>() -> for Native Query
		
//		Query query = em.createNativeQuery("SELECT * FROM employee");
//
//		List<Object[]> lists = query.getResultList();
//
//		for (Object[] array : lists) {
//
//			Employee employee = new Employee();
//
//			employee.setEmployeeId((Integer) array[0]);
//			employee.setFirstName((String) array[1]);
//			employee.setLastName((String) array[2]);
//			employee.setAge((Integer) array[3]);
//			employee.setSalary((Double) array[4]);
//
//			employees.add(employee);
//
//		}

		Query qury = em.createQuery("SELECT e FROM Employee e");
		employees  = (List<Employee>) qury.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;

	}

}
