package com.java.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Address;
import com.java.training.jpa.entity.Mobile;
import com.java.training.jpa.entity.Person;
import com.java.training.jpa.util.JPAUtil;

public class EmbededExample {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.setPrimaryMobile("Primary1");
		mobile.setAlternateMobile("Alternate1");

		Address address = new Address();
		address.setCity("City1");
		address.setZip("Zip1");

		Person person = new Person();
		person.setId(2);
		person.setFullName("Full Name1");
		person.setMobile(mobile);
		person.setAddress(address);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(person);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();
	}

}
