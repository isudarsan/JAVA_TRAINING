package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Branch;
import com.java.training.jpa.entity.Customer;
import com.java.training.jpa.util.JPAUtil;

public class OneToManyBiDirectionalCustomer {

	public static void main(String[] args) {

		//createStudentsInDepartment();
		//updateCustomer(3);
	}

	private static void createStudentsInDepartment() {

		Branch branch = new Branch();
		branch.setId(10);
		branch.setBranchName("MVP");

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("AAA");
		customer.setLastName("A");
		customer.setBranch(branch);

		Customer customer1 = new Customer();
		customer1.setId(2);
		customer1.setFirstName("BBB");
		customer1.setLastName("B");
		customer1.setBranch(branch);

		Customer customer2 = new Customer();
		customer2.setId(3);
		customer2.setFirstName("CCC");
		customer2.setLastName("C");
		customer2.setBranch(branch);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer1);
		customers.add(customer2);

		branch.setCustomer(customers);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(branch);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

	private static void updateCustomer(int customerId) {

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		Customer customer = em.find(Customer.class, customerId);
		em.getTransaction().begin();
		if (null != customer) {

			//TODO Explain as part of Detached & Managed objects
			Branch branch = new Branch();
			branch.setId(10);

			customer.setBranch(branch);

			em.merge(customer);

		}

	

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

	}

}
