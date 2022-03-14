/**
 * 
 */
package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.User;
import com.java.training.jpa.entity.UserDetails;
import com.java.training.jpa.entity.XUser;
import com.java.training.jpa.entity.XUserLogin;
import com.java.training.jpa.util.JPAUtil;

/**
 * @author sudarsanpro
 *
 */
public class OneToOneUniDirectionalMappingXUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		createUser();
		
	}

	private static void createUser() {

		XUser xUser = new XUser();
		xUser.setId(1);
		xUser.setFirstName("AAA");
		xUser.setLastName("BBB");
		xUser.setGender("M");

		XUserLogin xUserLogin = new XUserLogin();
		xUserLogin.setId(1);
		xUserLogin.setUserName("AAAUserName");
		xUserLogin.setPassword("AAAPassword");

		xUserLogin.setxUser(xUser);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(xUserLogin);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
