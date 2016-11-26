package com.dextraining.garagem.dominio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.dexraining.garagem.jpa.EntityManagerUtil;
import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemJPA implements Garagem {

	@Override
	public void adicionar(Veiculo veiculo) {
		Veiculo veiculoDuplicado = buscar(veiculo.getPlaca());
		if (veiculoDuplicado != null) {
			throw new VeiculoDuplicadoException();
		}
		salvar(veiculo);
	}

	@Override
	public void vender(String placa) {
		Veiculo veiculo = buscar(placa);
		if (veiculo == null) {
			throw new VeiculoNaoEncontradoException();
		}
		remover(veiculo);
	}

	@Override
	public Veiculo buscar(String placa) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = "SELECT v FROM Veiculo v WHERE v.placa = :placa";
			return em.createQuery(jpql, Veiculo.class).setParameter("placa", placa).getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}
	}

	@Override
	public List<Veiculo> listar() {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = "SELECT v FROM Veiculo v ORDER BY v.marca, v.modelo, v.ano, v.preco";
			return em.createQuery(jpql, Veiculo.class).getResultList();
		} finally {
			em.close();
		}
	}

	private void salvar(Veiculo veiculo) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(veiculo);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	private void remover(Veiculo veiculo) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			Veiculo veiculoGerenciado = em.merge(veiculo);
			em.remove(veiculoGerenciado);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
}
