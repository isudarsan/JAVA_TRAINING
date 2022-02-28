package com.java.training.jpa.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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

		em.getTransaction().begin();

		// SELECT * FROM EMPLOYEE WHERE employee_id = ?
		Employee employee = em.find(Employee.class, employeeId);

		em.getTransaction().commit();

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

}
