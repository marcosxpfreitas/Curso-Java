package com.dextraining.garagem.dominio;

import org.junit.Test;

import com.dexraining.garagem.jpa.EntityManagerUtil;

public class GaragemJPATest {

	@Test
	public void testarConfiguracao() {
		EntityManagerUtil.criarEntityManager();
		EntityManagerUtil.fechar();
	}

	// TODO: Adicionar teste para as operacoes da classe Garagem
}
