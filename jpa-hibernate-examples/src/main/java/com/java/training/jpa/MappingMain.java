package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.User;
import com.java.training.jpa.entity.UserDetails;
import com.java.training.jpa.util.JPAUtil;

public class MappingMain {

	public static void main(String[] args) {

		// createUser();

		delete();

	}

	private static void delete() {
		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// When there is a parent/child relation exists, to cascade the changes to the
		// tables for removal, always find the entity and pass on to the remove method.

		// If the remove method is applied on the new object without fetching from DB,
		// we see Illegal argumenet Exception since the object state is detatched.
		User user = em.find(User.class, 3);

		if (null == user) {
			System.out.println("Record Doesnt exist");
		} else {
			em.remove(user);
		}

		em.getTransaction().commit();

		em.close();
	}

	private static void createUser() {
		User user = new User();
		user.setId(3);
		user.setUserName("username");
		user.setPassword("password");
		user.setFirstName("firstName");
		user.setLastName("lastName");

		UserDetails userDetails = new UserDetails();
		userDetails.setId(3);
		userDetails.setCity("VIZAG");
		userDetails.setCountry("India");
		userDetails.setMobile("765");

		user.setUserDetails(userDetails);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(user);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
