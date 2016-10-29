package com.dextraining.banco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

public class BancoTeste {
	//Metodo que será executado após finalizar todos os testes
	@After
	public static void close(){
		EntityManagerUtil.fechar();
	}
	@Test
	public void salvarBancoTeste(){
		BancoService bancoService = new BancoService();
		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Brasil");
		Banco bancoItau = new Banco();
		bancoItau.setNome("Itaú");
		bancoService.salvar(bancoBrasil);
		bancoService.salvar(bancoItau);
	
		Assert.assertNotNull("ID do Itau não pode ser NULL",bancoItau.getId());
		Assert.assertNotNull("ID do Itau não pode ser NULL", bancoBrasil.getId());
		
		
	}
	@Test
	public void buscarPorIdTeste(){
		BancoService bancoService = new BancoService();
		Banco bancoDoBrasil = new Banco();
		bancoDoBrasil.setNome("Banco do Brasil");
		
		bancoService.salvar(bancoDoBrasil);
		
		
	
		
	}
}