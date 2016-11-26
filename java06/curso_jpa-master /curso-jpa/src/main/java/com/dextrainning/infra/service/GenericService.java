package com.dextrainning.infra.service;

import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextrainning.infra.jpa.Entidade;
import com.dextrainning.infra.jpa.EntityManagerUtil;

public class GenericService<T extends Entidade> {

	private Class<T> targetClass;

	public GenericService(Class<T> targetClass) {
		this.targetClass = targetClass;
	}

	public void salvar(T entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			saveOrUpdate(entidade, em);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	protected T saveOrUpdate(T entidade, EntityManager em) {
		if (entidade.getId() == null) {
			em.persist(entidade);
		} else {
			return em.merge(entidade);
		}
		return entidade;
	}

	public T buscarPorId(Long id) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			return em.find(targetClass, id);
		} finally {
			em.close();
		}
	}

	public List<T> buscarTodos() {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = MessageFormat.format("FROM {0} e", targetClass.getSimpleName());
			TypedQuery<T> query = em.createQuery(jpql, targetClass);
			return query.getResultList();
		} finally {
			em.close();
		}
	}
}
