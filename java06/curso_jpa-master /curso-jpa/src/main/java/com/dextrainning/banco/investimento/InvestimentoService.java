package com.dextrainning.banco.investimento;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextrainning.infra.exception.ValidacaoException;
import com.dextrainning.infra.jpa.EntityManagerUtil;
import com.dextrainning.infra.service.GenericService;

public class InvestimentoService extends GenericService<Investimento> {

	public InvestimentoService() {
		super(Investimento.class);
	}

	@Override
	public void salvar(Investimento investimento) {
		if (investimento.getDescricao() == null || investimento.getDescricao().isEmpty()) {
			throw new ValidacaoException("Descricao nao pode estar vazia");
		}
		if (investimento.getRendimentoMensal() == null || investimento.getRendimentoMensal() <= 0) {
			throw new ValidacaoException("Rendimento mensal invalido");
		}
		if (investimento.getValor() == null || investimento.getValor() <= 0) {
			throw new ValidacaoException("Valor invalido");
		}
		super.salvar(investimento);
	}

	public List<Investimento> buscarTodosOrdenadosPorValorDesc() {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = "SELECT i FROM Investimento i ORDER BY i.valor DESC";
			TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	public List<Investimento> buscarTodosMaioresQueMil() {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT i FROM Investimento i ");
			jpql.append("WHERE i.valor >= 1000 AND i.rendimentoMensal >  0.25");

			TypedQuery<Investimento> query = em.createQuery(jpql.toString(), Investimento.class);
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	public List<Investimento> buscarPorDescricao(String descricao) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT i FROM Investimento i ");
			jpql.append("WHERE UPPER(i.descricao) LIKE UPPER(:descricao) order by i.data");

			TypedQuery<Investimento> query = em.createQuery(jpql.toString(), Investimento.class);
			query.setParameter("descricao", "%" + descricao + "%");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

}
