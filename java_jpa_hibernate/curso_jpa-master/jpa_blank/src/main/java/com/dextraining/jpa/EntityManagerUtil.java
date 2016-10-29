package com.dextraining.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que lida com a criacao dos {@link EntityManager}.
 *
 */
public class EntityManagerUtil {

	private static EntityManagerFactory FACTORY;

	public static EntityManager criarEntityManager() {
		if (FACTORY == null) {
			FACTORY = Persistence.createEntityManagerFactory("MY_PERSISTENCE_UNIT_NAME");
		}
		return FACTORY.createEntityManager();
	}

	public static void fechar() {
		if (FACTORY != null) {
			FACTORY.close();
		}
	}
}