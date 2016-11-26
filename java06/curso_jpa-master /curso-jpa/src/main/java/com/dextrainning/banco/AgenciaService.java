package com.dextrainning.banco;

import javax.persistence.EntityManager;

import com.dextrainning.infra.jpa.EntityManagerUtil;
import com.dextrainning.infra.service.GenericService;

public class AgenciaService extends GenericService<Agencia> {

	public AgenciaService() {
		super(Agencia.class);
	}

	@Override
	public void salvar(Agencia entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			salvarEndereco(entidade, em);
			saveOrUpdate(entidade, em);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	private void salvarEndereco(Agencia entidade, EntityManager em) {
		if (entidade.getEndereco() != null) {
			em.persist(entidade.getEndereco());
		}
	}
}
