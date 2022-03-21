package com.java.training.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.java.training.jpa.entity.Child;
import com.java.training.jpa.entity.Parent;
import com.java.training.jpa.util.JPAUtil;

public class DemoJoinColumnOptional {

	public static void main(String[] args) {

		Child child = new Child();
		child.setId(1);
		child.setChildName("C1");

		Child child1 = new Child();
		child1.setId(2);
		child1.setChildName("C2");

		List<Child> children = new ArrayList<Child>();
		children.add(child);
		children.add(child1);

		Parent parent = new Parent();
		parent.setId(1);
		parent.setParentName("P1");

		parent.setChildren(children);

		EntityManagerFactory emf = JPAUtil.getEMF();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(parent);

		em.getTransaction().commit();

		em.close();

		JPAUtil.close();

	}

}
