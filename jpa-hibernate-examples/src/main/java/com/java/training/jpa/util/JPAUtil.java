package com.java.training.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory EMF;

	public static EntityManagerFactory getEMF() {

		if (null == EMF) {
			EMF = Persistence.createEntityManagerFactory("myPu");
		}

		return EMF;

	}

	public static void close() {
		if(null!=EMF) {
			EMF.close();
		}
	}

}
