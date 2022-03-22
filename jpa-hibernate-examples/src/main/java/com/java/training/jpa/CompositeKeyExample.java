package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.EmployeeComposite;
import com.java.training.jpa.entity.EmployeeCompositeKey;
import com.java.training.jpa.util.JPAUtil;

public class CompositeKeyExample {

	public static void main(String[] args) {

		// createEmployees();

		// proofForCompositeKey();

		findByCompositeKey(new EmployeeCompositeKey(6, 20));
	}

	private static void createEmployees() {
		EmployeeComposite emp1 = new EmployeeComposite(new EmployeeCompositeKey(1, 10), "AAA");
		EmployeeComposite emp2 = new EmployeeComposite(new EmployeeCompositeKey(2, 20), "BBB");
		EmployeeComposite emp3 = new EmployeeComposite(new EmployeeCompositeKey(3, 30), "CCC");
		EmployeeComposite emp4 = new EmployeeComposite(new EmployeeCompositeKey(4, 40), "DDD");
		EmployeeComposite emp5 = new EmployeeComposite(new EmployeeCompositeKey(1, 20), "EEE");
		EmployeeComposite emp6 = new EmployeeComposite(new EmployeeCompositeKey(2, 40), "FFF");
		EmployeeComposite emp7 = new EmployeeComposite(new EmployeeCompositeKey(3, 10), "GGG");

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.persist(emp5);
		em.persist(emp6);
		em.persist(emp7);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

	private static void proofForCompositeKey() {

		// This is not possible since there exists a record in the table with below
		// CompositeKey.
		EmployeeComposite emp1 = new EmployeeComposite(new EmployeeCompositeKey(1, 20), "SomeOne");

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(emp1);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

	private static void findByCompositeKey(EmployeeCompositeKey compositeKey) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		EmployeeComposite emp = em.find(EmployeeComposite.class, compositeKey);

		if (null != emp) {
			System.out.println("Employee Found and his name is : " + emp.getEmployeeName());
		} else {
			System.out.println("Employee not found");
		}

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
