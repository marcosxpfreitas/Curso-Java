package com.dextrainning.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private static EntityManagerFactory factory;

	public static EntityManager criarEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("CURSO_JPA");
		}
		return factory.createEntityManager();
	}

	public static void fechar() {
		if (factory != null) {
			factory.close();
			factory = null;
		}
	}
}
