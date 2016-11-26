package com.dextrainning.filmes;

import java.util.Arrays;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dextrainning.infra.jpa.EntityManagerUtil;

public class FilmeServiceTest {

	private AtorService atorService;
	private FilmeService filmeService;
	private DiretorService diretorService;
	private CategoriaService categoriaService;

	@Before
	public void init() {
		this.atorService = new AtorService();
		this.filmeService = new FilmeService();
		this.diretorService = new DiretorService();
		this.categoriaService = new CategoriaService();
	}

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarFilmeTest() {
		Categoria categoriaAcao = new Categoria();
		categoriaAcao.setNome("Ação");
		this.categoriaService.salvar(categoriaAcao);

		Categoria categoriaDrama = new Categoria();
		categoriaDrama.setNome("Drama");
		this.categoriaService.salvar(categoriaDrama);

		Diretor diretor = new Diretor();
		diretor.setNome("Copola");
		this.diretorService.salvar(diretor);

		Ator allPacino = new Ator();
		allPacino.setNome("All pacino");
		this.atorService.salvar(allPacino);

		Ator marlonBrando = new Ator();
		marlonBrando.setNome("Marlon Brando");
		this.atorService.salvar(marlonBrando);
		
		Filme filme = new Filme();
		filme.setNome("Poderoso Chefão");
		filme.setDataLancamento(new Date());
		filme.setCategorias(Arrays.asList(categoriaAcao, categoriaDrama));
		filme.setDiretor(diretor);
		filme.setAtores(Arrays.asList(allPacino, marlonBrando));
		
		filmeService.salvar(filme);
		Assert.assertNotNull(filme.getId());
	}
}
