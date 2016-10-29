package com.dextraining.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.banco.PessoaService;
import com.dextraining.jpa.EntityManagerUtil;

public class PessoaTeste {
	
	@After
	public void close(){
		EntityManagerUtil.fechar();
	}
	@Test
	public void SalvarPessoaTeste() throws ParseException{
		SimpleDateFormat simpleDate =  new SimpleDateFormat("dd-MM-yyyy"); 

		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Marcos");
		
		pessoa1.setDataNasc(simpleDate.parse("24-08-1995"));
		
		pessoaService.salvar(pessoa1);
		Assert.assertNotNull("ID do Itau não pode ser NULL",pessoa1.getId());
		
	}	
	@Test
	public void BuscarPessoaPorIdTeste() throws ParseException{
		SimpleDateFormat simpleDate =  new SimpleDateFormat("dd-MM-yyyy"); 
		
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Jorge");
		pessoa1.setDataNasc(simpleDate.parse("24-08-1995"));
		pessoaService.salvar(pessoa1);
		
		Assert.assertNotNull(pessoa1);
		
		
		
	}
	@Test
	public void BuscarTodosTest() throws ParseException{
		SimpleDateFormat simpleDate =  new SimpleDateFormat("dd-MM-yyyy"); 
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Jorge");
		pessoa1.setDataNasc(simpleDate.parse("24-08-1995"));
		pessoaService.salvar(pessoa1);
		List<Pessoa> pessoas = pessoaService.buscarTodos();
		Assert.assertEquals(1, pessoas.size()); //comparando os registros do banco com os registros na lista
		
		
	}
		
		
		
	
	
}
