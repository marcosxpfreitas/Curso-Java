package com.pousar.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que lida com a criacao dos {@link EntityManager}.
 *
 */
public class EntityManagerUtil {

	private static EntityManagerFactory FACTORY;

	public static void init() {
		FACTORY = Persistence.createEntityManagerFactory("POUSAR_PU");
	}

	public static EntityManager criarEntityManager() {
		if (FACTORY == null) {
			init();
		}
		return FACTORY.createEntityManager();
	}

	public static void fechar() {
		if (FACTORY != null) {
			FACTORY.close();
			FACTORY = null;
		}
	}
}
