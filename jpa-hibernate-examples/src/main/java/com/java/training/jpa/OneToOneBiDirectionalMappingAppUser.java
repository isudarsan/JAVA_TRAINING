package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.AppUser;
import com.java.training.jpa.entity.AppUserLogin;
import com.java.training.jpa.util.JPAUtil;

public class OneToOneBiDirectionalMappingAppUser {

	public static void main(String[] args) {

		createUser();
	}
	
	
	private static void createUser() {

		AppUser appUser = new AppUser();
		appUser.setId(1);
		appUser.setFirstName("AAA");
		appUser.setLastName("BBB");
		appUser.setGender("M");

		AppUserLogin appUserLogin = new AppUserLogin();
		appUserLogin.setId(1);
		appUserLogin.setUserName("AAAUserName");
		appUserLogin.setPassword("AAAPassword");
		
		
		
		appUser.setAppUserLogin(appUserLogin);

		appUserLogin.setAppUser(appUser);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(appUserLogin);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}


}
