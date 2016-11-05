package com.dextraining.garagem.dominio;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dexraining.garagem.jpa.EntityManagerUtil;
import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemJPATest {

	private Garagem garagem;

	@Before
	public void before() {
		// TODO: alterar para garagem com JPA
		this.garagem = new GaragemComMapa();
	}

	@After
	public void after() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void adicionarVeiculoTest() {
		Veiculo veiculo = new Veiculo("Fiat", "Uno", "HHH-123", 2000, 15000);
		garagem.adicionar(veiculo);
		Assert.assertTrue(garagem.listar().contains(veiculo));
	}

	@Test(expected = VeiculoDuplicadoException.class)
	public void adicionarVeiculoDuplicadoTest() {
		Veiculo veiculo = new Veiculo("Fiat", "Uno", "HHH-123", 2000, 15000);
		Veiculo outroVeiculo = new Veiculo("Ferrari", "FF", "HHH-123", 2000, 150000000);

		garagem.adicionar(veiculo);
		garagem.adicionar(outroVeiculo);
	}

	@Test
	public void venderVeiculoTeste() {
		Veiculo veiculo = new Veiculo("Fiat", "Uno", "HHH-123", 2000, 15000);
		garagem.adicionar(veiculo);
		garagem.vender(veiculo.getPlaca());

		Assert.assertFalse(garagem.listar().contains(veiculo));
	}

	@Test(expected = VeiculoNaoEncontradoException.class)
	public void venderVeiculoInexistenteTeste() {
		garagem.vender("HHH-123");
	}

	@Test
	public void buscarVeiculoTest() {
		Veiculo veiculo = new Veiculo("Fiat", "Uno", "HHH-123", 2000, 15000);
		garagem.adicionar(veiculo);

		Assert.assertNotNull(garagem.buscar(veiculo.getPlaca()));
		Assert.assertNull(garagem.buscar("HHH-124"));
	}

	@Test
	public void listarVeiculosSemveiculosTeste() {
		Assert.assertTrue(garagem.listar().isEmpty());
	}

	@Test
	public void listarVeiculosTeste() {
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-123", 2000, 15000));
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-124", 2000, 15000));
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-125", 2000, 15000));
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-126", 2000, 15000));
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-127", 2000, 15000));
		garagem.adicionar(new Veiculo("Fiat", "Uno", "HHH-128", 2000, 15000));

		Assert.assertEquals(6, garagem.listar().size());
	}
}
