package com.pousar.jpa;

import javax.persistence.EntityManager;

public class BaseService<T extends Entidade> {

	private Class<T> classe;

	public BaseService(Class<T> classe) {
		this.classe = classe;
	}

	/**
	 * Salva ou atualiza os dados de uma entidade usando o EntityManager.
	 * 
	 * @param entidade
	 * @return
	 */
	public T salvar(T entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			if (entidade.getId() == null) {
				em.persist(entidade);
			} else {
				entidade = em.merge(entidade);
			}
			em.getTransaction().commit();
			return entidade;
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	public T buscarPorId(Long id) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			return em.find(classe, id);
		} finally {
			em.close();
		}
	}

	public void remover(Long id) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			T entidade = em.find(classe, id);
			em.remove(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}
}