package com.dextrainning.investimento;

import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextrainning.exception.ValidacaoException;
import com.dextrainning.jpa.EntityManagerUtil;

public class InvestimentoServiceTest {

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarComSucessoTest() {
		Investimento investimento = criarInvestimento("Meu investimento", 10.00, 0.5);

		InvestimentoService investimentoService = new InvestimentoService();
		investimentoService.salvar(investimento);
		Investimento investimentoSalvo = investimentoService.buscarPorId(investimento.getId());
		Assert.assertNotNull(investimentoSalvo);
	}

	@Test(expected = ValidacaoException.class)
	public void salvarSemCampoObrigatorioTest() {
		Investimento investimento = criarInvestimento(null, 10.00, 0.5);
		InvestimentoService investimentoService = new InvestimentoService();
		investimentoService.salvar(investimento);
	}

	@Test
	public void buscarTodosOrdenadosPorValorDescTest() {
		int quantidade = 100;
		InvestimentoService investimentoService = new InvestimentoService();

		criarInvestimentos(quantidade);

		List<Investimento> investimentos = investimentoService.buscarTodosOrdenadosPorValorDesc();
		Assert.assertEquals(quantidade, investimentos.size());
		assertEstaEmDesc(investimentos);
	}

	private void assertEstaEmDesc(List<Investimento> investimentos) {
		for (int i = 0; i < investimentos.size() - 1; i++) {
			Investimento atual = investimentos.get(i);
			Investimento proximo = investimentos.get(i + 1);

			Assert.assertTrue(atual.getValor() >= proximo.getValor());
		}
	}

	private void criarInvestimentos(int quantidade) {
		InvestimentoService investimentoService = new InvestimentoService();

		for (int i = 0; i < quantidade; i++) {
			Double valor = 1000 + new Random().nextDouble();
			Double rendimento = new Random().nextDouble();
			investimentoService.salvar(criarInvestimento("Investimento " + i, rendimento, valor));
		}
	}

	private Investimento criarInvestimento(String descricao, Double rendimento, Double valor) {
		Investimento investimento = new Investimento();
		investimento.setDescricao(descricao);
		investimento.setRendimentoMensal(rendimento);
		investimento.setValor(valor);
		return investimento;
	}
}
