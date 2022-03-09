//package com.java.training.jpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//import com.java.training.jpa.entity.UserUni;
//import com.java.training.jpa.entity.UserDetailsUni;
//import com.java.training.jpa.util.JPAUtil;
//
//public class OneToOneUniDirectionalMappingMain {
//
//	public static void main(String[] args) {
//
//		// createUser();
//
//		delete();
//
//	}
//
//	private static void delete() {
//		EntityManagerFactory emf = JPAUtil.getEMF();
//		EntityManager em = emf.createEntityManager();
//
//		em.getTransaction().begin();
//
//		// When there is a parent/child relation exists, to cascade the changes to the
//		// tables for removal, always find the entity and pass on to the remove method.
//
//		// If the remove method is applied on the new object without fetching from DB,
//		// we see Illegal argumenet Exception since the object state is detatched.
//		UserUni userUni = em.find(UserUni.class, 3);
//
//		if (null == userUni) {
//			System.out.println("Record Doesnt exist");
//		} else {
//			em.remove(userUni);
//		}
//
//		em.getTransaction().commit();
//
//		em.close();
//		
//		JPAUtil.close();
//	}
//
//	private static void createUser() {
//		UserUni userUni = new UserUni();
//		userUni.setId(3);
//		userUni.setUserName("username");
//		userUni.setPassword("password");
//		userUni.setFirstName("firstName");
//		userUni.setLastName("lastName");
//
//		UserDetailsUni userDetailsUni = new UserDetailsUni();
//		userDetailsUni.setId(3);
//		userDetailsUni.setCity("VIZAG");
//		userDetailsUni.setCountry("India");
//		userDetailsUni.setMobile("765");
//
//		userUni.setUserDetails(userDetailsUni);
//
//		EntityManagerFactory emf = JPAUtil.getEMF();
//		EntityManager em = emf.createEntityManager();
//
//		em.getTransaction().begin();
//
//		em.persist(userUni);
//
//		em.getTransaction().commit();
//
//		em.close();
//
//		JPAUtil.close();
//	}
//
//}
