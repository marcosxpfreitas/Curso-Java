package com.dextrainning.pessoa;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextrainning.jpa.EntityManagerUtil;

public class PessoaServiceTest {

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarPessoaTest() {
		PessoaService pessoaService = new PessoaService();

		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoaService.salvar(pessoa);

		Assert.assertNotNull(pessoa.getId());
	}

	@Test
	public void buscarPorIdTeste() throws ParseException {
		PessoaService pessoaService = new PessoaService();

		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoaService.salvar(pessoa);

		Pessoa pessoaNaoEncontrada = pessoaService.buscarPorId(-1L);
		Pessoa pessoaEncontrada = pessoaService.buscarPorId(pessoa.getId());

		Assert.assertNull(pessoaNaoEncontrada);
		Assert.assertNotNull(pessoaEncontrada);
	}

	@Test
	public void buscarTodosTeste() {
		PessoaService pessoaService = new PessoaService();

		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoaService.salvar(pessoa);

		List<Pessoa> pessoas = pessoaService.buscarTodos();
		Assert.assertEquals(1, pessoas.size());
	}
}
