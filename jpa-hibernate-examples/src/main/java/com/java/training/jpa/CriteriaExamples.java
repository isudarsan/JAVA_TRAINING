package com.java.training.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.java.training.jpa.entity.Employee;
import com.java.training.jpa.util.JPAUtil;

public class CriteriaExamples {

	public static void main(String[] args) {

		// getAllusingCriteria();

		// getEmployeesBySalary();

		// select * from employee where salary = 1001 and firstname = 'aaa' and
		// last_name = 'bbb'

		// select salary,firstName from employee;

		//TODO Tuple revisit
		getEmployeesBySalaryAndFirstName();
	}

	private static void getEmployeesBySalaryAndFirstName() {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = builder.createQuery(Employee.class);
		Root<Employee> emp = cq.from(Employee.class);

		// "get" method refers to the fields in the Entity class
		// if a query needs to get employees based on first name, use get("firstName")

		cq.select(emp).multiselect(emp.get("salary"), emp.get("firstName"));

		Query query = em.createQuery(cq);

		List<Tuple> list = query.getResultList();

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

		for (Tuple e : list) {

			System.out.println(e.get(0, Double.class) + "  " + e.get(1, String.class));

		}

	}

	private static void getEmployeesBySalary() {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = builder.createQuery(Employee.class);
		Root<Employee> emp = cq.from(Employee.class);

		// "get" method refers to the fields in the Entity class
		// if a query needs to get employees based on first name, use get("firstName")

		cq.select(emp).where(builder.equal(emp.get("salary"), 1001));

		Query query = em.createQuery(cq);

		List<Employee> list = query.getResultList();

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

		for (Employee e : list) {
			System.out.println(e.getFirstName() + " " + e.getSalary());
		}

	}

	private static void getAllusingCriteria() {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Criteria API is used to build SQL queries using Java
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);

		Root<Employee> root = query.from(Employee.class);

		query.select(root);

		Query q = em.createQuery(query);
		List<Employee> list = q.getResultList();

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

		for (Employee emp : list) {
			System.out.println(emp.getFirstName());
		}
	}

}
