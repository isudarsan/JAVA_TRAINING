package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.User;
import com.java.training.jpa.entity.UserDetails;
import com.java.training.jpa.util.JPAUtil;

public class OneToOneBiDirectionalMappingMain {

	public static void main(String args[]) {
		
		createUser();

	}
	
	
	
	private static void createUser() {
		User user = new User();
		user.setId(1);
		user.setUserName("username");
		user.setPassword("password");
		user.setFirstName("firstName");
		user.setLastName("lastName");

		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setCity("VIZAG");
		userDetails.setCountry("India");
		userDetails.setMobile("765");
		
		userDetails.setUser(user);
		

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
