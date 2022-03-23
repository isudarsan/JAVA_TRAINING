package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.FullTimeEmployee;
import com.java.training.jpa.entity.PartTimeEmployee;
import com.java.training.jpa.util.JPAUtil;

public class InheritanceMappedSuperClass {

	public static void main(String[] args) {


		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
		fullTimeEmployee.setId(1);
		fullTimeEmployee.setName("Full Time AAAA");
		fullTimeEmployee.setFullTimeSalary(1000);

		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		partTimeEmployee.setId(2);
		partTimeEmployee.setName("Part Time BBBB");
		partTimeEmployee.setHourlySalary(40);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(fullTimeEmployee);
		em.persist(partTimeEmployee);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

		
	}

}
