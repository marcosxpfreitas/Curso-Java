package com.dextrainning.investimento;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextrainning.exception.ValidacaoException;
import com.dextrainning.jpa.EntityManagerUtil;
import com.dextrainning.service.GenericService;

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
}
