package com.dextrainning.banco;

import java.text.ParseException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextrainning.jpa.EntityManagerUtil;

public class BancoServiceTest {

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarBancoTeste() {
		BancoService bancoService = new BancoService();

		Banco bancoBradesco = new Banco();
		bancoBradesco.setNome("Bradesco");

		Banco bancoDoBrasil = new Banco();
		bancoDoBrasil.setNome("Banco do Brasil");

		bancoService.salvar(bancoBradesco);
		bancoService.salvar(bancoDoBrasil);

		Assert.assertNotNull("Id do bradesco nao pode ser null", bancoBradesco.getId());
		Assert.assertNotNull("Id do banco do brasil nao pode ser null", bancoDoBrasil.getId());
	}

	@Test
	public void buscarPorIdTeste() throws ParseException {
		BancoService bancoService = new BancoService();
		Banco bancoDoBrasil = new Banco();
		bancoDoBrasil.setNome("Banco do Brasil");

		bancoService.salvar(bancoDoBrasil);

		Banco banco = bancoService.buscarPorId(-1L);
		Banco bancoEncontrado = bancoService.buscarPorId(bancoDoBrasil.getId());

		Assert.assertNull(banco);
		Assert.assertNotNull(bancoEncontrado);
		Assert.assertEquals(bancoDoBrasil.getNome(), bancoEncontrado.getNome());
	}
}
