package com.java.training.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.java.training.jpa.entity.Employee;
import com.java.training.jpa.util.JPAUtil;

public class CriteriaExamples {

	public static void main(String[] args) {

		getAllusingCriteria();

	}

	private static void getAllusingCriteria() {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

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
