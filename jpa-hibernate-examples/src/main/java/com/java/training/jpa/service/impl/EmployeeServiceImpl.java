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

	public List<Employee> getAllUsingJPQL() {

		// Transaction is not required when we are using JPA Query interface or finding
		// any entity using EntintManager
		// Transaction is required when we perform INSERT, UPDATE & DELETE operations.

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Query qury = em.createQuery("SELECT e FROM Employee e");
		Query qury = em.createQuery("from Employee e");
		List<Employee> employees = (List<Employee>) qury.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;

	}

	public List<Employee> getAllUsingNativeQuery() {

		List<Employee> employees = new ArrayList<Employee>();

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		Query query = em.createNativeQuery("SELECT * FROM employee");

		List<Object[]> lists = query.getResultList();

		for (Object[] array : lists) {

			Employee employee = new Employee();

			// If we dont cast the index of array, we will get class cast exception.
			employee.setEmployeeId((Integer) array[0]);
			employee.setFirstName((String) array[1]);
			employee.setLastName((String) array[2]);
			employee.setAge((Integer) array[3]);
			employee.setSalary((Double) array[4]);

			employees.add(employee);

		}

		emf.close();
		JPAUtil.close();

		return employees;
	}

	public List<Employee> getAllUsingNativeQueryWithOverloadedMethod() {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Result Class must be an Entity, else JPA throws Unknown entity exception
		Query query = em.createNativeQuery("SELECT * FROM employee", Employee.class);

		List<Employee> employees = (List<Employee>) query.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;
	}

	public Long getCountOfAllRecords() {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// select count(*) from employee

		Query query = em.createQuery("SELECT COUNT(e) FROM Employee e");
		Long totalCount = (Long) query.getSingleResult();

		emf.close();
		JPAUtil.close();

		return totalCount;

	}

	public List<String> getFirstNameBasedOnLastName(String lastName) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// select first_name from employee where last_name = ?

		Query query = em.createQuery("SELECT e.firstName FROM Employee e WHERE e.lastName =: last");
		query.setParameter("last", lastName);

		List<String> firstNameList = query.getResultList();

		emf.close();
		JPAUtil.close();

		return firstNameList;

	}

	public List<String> getFirstNameBasedOnLastNameAndAge(String lastName, int age) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// select first_name from employee where last_name = ? and age = ?

		Query query = em
				.createQuery("SELECT e.firstName FROM Employee e WHERE e.lastName =: lastName AND e.age =: age");
		query.setParameter("lastName", lastName);
		query.setParameter("age", age);
		List<String> firstNameList = query.getResultList();

		emf.close();
		JPAUtil.close();

		return firstNameList;
	}

	public List<Employee> getAllUsingJPQLUsingNamedQuery() {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Query qury = em.createQuery("SELECT e FROM Employee e");
		Query qury = em.createNamedQuery("Employee.getAll");
		List<Employee> employees = (List<Employee>) qury.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;

	}

	public List<Employee> getAllByAge(int age) {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Query qury = em.createQuery("SELECT e FROM Employee e");
		Query query = em.createNamedQuery("Employee.findByAge");
		query.setParameter("age", age);
		List<Employee> employees = (List<Employee>) query.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;
	}

	public List<Employee> getAllUsingNamedNativeQuery() {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		// Result Class must be specified in entity itself when using named query.
//		Query query = em.createNativeQuery("SELECT * FROM employee", Employee.class);
		Query query = em.createNamedQuery("Employee.namedFindAll");

		List<Employee> employees = (List<Employee>) query.getResultList();

		emf.close();
		JPAUtil.close();

		return employees;
	}

}
