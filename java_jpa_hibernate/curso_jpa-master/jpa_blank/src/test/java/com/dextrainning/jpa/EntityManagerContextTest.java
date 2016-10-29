package com.dextrainning.jpa;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.entidade.Entidade;
import com.dextraining.jpa.EntityManagerUtil;

public class EntityManagerContextTest {

	@After
	public void tearDown() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void criarEntityManagerTeste() {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		em.getTransaction().begin();
		Entidade entidade = new Entidade();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();

		Assert.assertNotNull(entidade.getId());
	}
}
