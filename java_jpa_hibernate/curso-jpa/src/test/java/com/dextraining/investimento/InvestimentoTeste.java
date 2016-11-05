package com.dextraining.investimento;

import java.math.BigDecimal;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.exception.ValidacaoException;
import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.service.InvestimentoService;




public class InvestimentoTeste {
	
	@After
	public void close(){
		EntityManagerUtil.fechar();
	}
	@Test
	public void SalvarInvestimentoTest(){
		Investimento investimento = new Investimento("Poupança",BigDecimal.valueOf(40000.00),BigDecimal.valueOf(450.00));
		InvestimentoService investimentoService = new InvestimentoService();
		investimentoService.salvar(investimento);
		investimentoService.buscarPorId(investimento.getId());
		Assert.assertNotNull(investimento.getRendimentoMensal());
		
	}
	
	
	@Test(expected = ValidacaoException.class)
	public void SalvarSemCampoObrigatorio(){
		
		Investimento investimento1 = new Investimento();
		InvestimentoService investimentoService = new InvestimentoService();
		investimento1.setValor(BigDecimal.valueOf(450.00));
		investimento1.setDescricao("poker");
		investimentoService.salvar(investimento1);
		Assert.assertNull(investimento1.getId());

	}
	
	
	@Test
	public void ConsultarTodosDescrescente(){
		Investimento investimento1 = new Investimento("POKER",BigDecimal.valueOf(40000.00),BigDecimal.valueOf(5));
		Investimento investimento2 = new Investimento("BANCO",BigDecimal.valueOf(400000.00),BigDecimal.valueOf(15));
		Investimento investimento3 = new Investimento("BOLSA DE VALORES",BigDecimal.valueOf(112257567.00),BigDecimal.valueOf(0.6));
		InvestimentoService investimentoService = new InvestimentoService();
		investimentoService.salvar(investimento1);
		investimentoService.salvar(investimento2);
		investimentoService.salvar(investimento3);
		
		
		
		List <Investimento> lista = investimentoService.buscarTodos();
		
		Assert.assertEquals(3, lista.size());
		
		for(int cont = 0; cont < lista.size()-1; cont++){
			Investimento atual = lista.get(cont);
			Investimento proximo = lista.get(cont+1);
			
			Assert.assertTrue(atual.getValor() >= proximo.getValor());
			
		}
		
		
		
		
	
		
		
		
		
		
	}
	
	
}
