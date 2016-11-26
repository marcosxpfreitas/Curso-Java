package com.dextrainning.banco.pessoa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextrainning.banco.Agencia;
import com.dextrainning.banco.AgenciaService;
import com.dextrainning.banco.ServicoBancario;
import com.dextrainning.banco.ServicoBancarioService;
import com.dextrainning.banco.endereco.Endereco;
import com.dextrainning.banco.investimento.Investimento;
import com.dextrainning.banco.investimento.InvestimentoService;
import com.dextrainning.banco.pessoa.Pessoa;
import com.dextrainning.banco.pessoa.PessoaFisica;
import com.dextrainning.banco.pessoa.PessoaFisicaService;
import com.dextrainning.banco.pessoa.PessoaJuridica;
import com.dextrainning.banco.pessoa.PessoaJuridicaService;
import com.dextrainning.banco.telefone.Telefone;
import com.dextrainning.banco.telefone.TipoTelefone;
import com.dextrainning.infra.jpa.EntityManagerUtil;

public class PessoaServiceTest {

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarPessoaTest() {
		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
		PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua sem saida");
		endereco.setNumero(0001);
		endereco.setEstado("SP");

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setEndereco(endereco);
		pessoaFisicaService.salvar(pessoa);

		PessoaJuridica pessoaPJ = new PessoaJuridica();
		pessoaPJ.setNome("Empresa qualquer");
		pessoaPJ.setCnpj("000.000.000/01");
		pessoaJuridicaService.salvar(pessoaPJ);

		Assert.assertNotNull(pessoa.getId());
	}

	@Test
	public void buscarPessoaFisicaPorIdTeste() throws ParseException {
		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoaFisicaService.salvar(pessoa);

		Pessoa pessoaNaoEncontrada = pessoaFisicaService.buscarPorId(-1L);
		Pessoa pessoaEncontrada = pessoaFisicaService.buscarPorId(pessoa.getId());

		Assert.assertNull(pessoaNaoEncontrada);
		Assert.assertNotNull(pessoaEncontrada);
	}

	@Test
	public void buscarTodosTeste() {
		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
		PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoaFisicaService.salvar(pessoa);

		PessoaJuridica pessoaPJ = new PessoaJuridica();
		pessoaPJ.setNome("Empresa qualquer");
		pessoaPJ.setCnpj("000.000.000/01");
		pessoaJuridicaService.salvar(pessoaPJ);

		List<PessoaFisica> pessoasFisicas = pessoaFisicaService.buscarTodos();
		List<PessoaJuridica> pessoasJuridicas = pessoaJuridicaService.buscarTodos();

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.addAll(pessoasFisicas);
		pessoas.addAll(pessoasJuridicas);

		Assert.assertEquals(2, pessoas.size());
	}

	@Test
	public void testarEstado() {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setNome("Manuel"); // ainda nao gerenciado

		EntityManager em = EntityManagerUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		pessoa.setNome("Juquinha"); // depois de gerenciado, vai alterar no
									// banco
		em.getTransaction().commit();
		em.close();
	}

	@Test
	public void testarDevoltarEntidade() {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setNome("Manuel");

		EntityManager em = EntityManagerUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();

		em = EntityManagerUtil.criarEntityManager();
		em.getTransaction().begin();
		pessoa = em.merge(pessoa);
		pessoa.setNome("Juquinha"); // depois de gerenciado, vai alterar no
									// banco
		em.getTransaction().commit();
		em.close();
	}

	@Test
	public void salvarPessoasComAgenciaTest() {
		Endereco enderecoAgencia = new Endereco();
		enderecoAgencia.setLogradouro("Endereco da agencia");
		enderecoAgencia.setNumero(0001);
		enderecoAgencia.setEstado("SP");

		Agencia agencia = new Agencia();
		agencia.setNumero("123456");
		agencia.setEndereco(enderecoAgencia);

		Agencia segundaAgencia = new Agencia();
		agencia.setNumero("123456");
		agencia.setEndereco(enderecoAgencia);

		AgenciaService agenciaService = new AgenciaService();
		agenciaService.salvar(agencia);
		agenciaService.salvar(segundaAgencia);

		Endereco enderecoPessoa = new Endereco();
		enderecoPessoa.setLogradouro("Rua sem saida");
		enderecoPessoa.setNumero(0001);
		enderecoPessoa.setEstado("SP");

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setEndereco(enderecoPessoa);
		pessoa.setAgencia(agencia);

		PessoaFisica segundaPessoa = new PessoaFisica();
		segundaPessoa.setDataNascimento(new Date());
		segundaPessoa.setNome("Outra pessoa");
		segundaPessoa.setCpf("000.000.000-01");
		segundaPessoa.setEndereco(enderecoPessoa);
		segundaPessoa.setAgencia(agencia);

		PessoaFisica terceiraPessoa = new PessoaFisica();
		terceiraPessoa.setDataNascimento(new Date());
		terceiraPessoa.setNome("Mais uma pessoa");
		terceiraPessoa.setCpf("000.000.000-01");
		terceiraPessoa.setEndereco(enderecoPessoa);
		terceiraPessoa.setAgencia(segundaAgencia);

		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
		pessoaFisicaService.salvar(pessoa);
		pessoaFisicaService.salvar(segundaPessoa);
		pessoaFisicaService.salvar(terceiraPessoa);

		List<PessoaFisica> pessoasPrimeiraAgencia = pessoaFisicaService.buscarPorAgencia(agencia);
		List<PessoaFisica> pessoasSegundaAgencia = pessoaFisicaService.buscarPorAgencia(segundaAgencia);

		Assert.assertNotNull(pessoa.getId());
		Assert.assertEquals(2, pessoasPrimeiraAgencia.size());
		Assert.assertEquals(1, pessoasSegundaAgencia.size());
	}

	@Test
	public void salvarPessoaComTelefonesTest() {
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(new Telefone("12132", TipoTelefone.CELULAR));
		telefones.add(new Telefone("4562", TipoTelefone.RESIDENCIAL));

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setTelefones(telefones);

		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
		pessoaFisicaService.salvar(pessoa);

		Assert.assertNotNull(pessoa.getId());
	}

	@Test
	public void salvarPessoaComServicosTest() {
		ServicoBancario servicoBancario = new ServicoBancario();
		ServicoBancario segundoServicoBancario = new ServicoBancario();

		ServicoBancarioService servicoBancarioService = new ServicoBancarioService();
		servicoBancarioService.salvar(servicoBancario);
		servicoBancarioService.salvar(segundoServicoBancario);

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Diego Farias da Silva");
		pessoa.setCpf("000.000.000-00");
		pessoa.setServicos(Arrays.asList(servicoBancario, segundoServicoBancario));

		PessoaFisica segundaPessoa = new PessoaFisica();
		segundaPessoa.setDataNascimento(new Date());
		segundaPessoa.setNome("Juquinha");
		segundaPessoa.setCpf("000.000.000-01");
		segundaPessoa.setServicos(Arrays.asList(servicoBancario));

		PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
		pessoaFisicaService.salvar(pessoa);
		pessoaFisicaService.salvar(segundaPessoa);

		Assert.assertNotNull(pessoa.getId());
	}

	@Test
	public void salvarPessoaComInvestimentos() {
		Investimento investimento = new Investimento();
		investimento.setDescricao("Qualquer");
		investimento.setRendimentoMensal(0.01);
		investimento.setValor(500.00);

		PessoaFisica pessoaA = new PessoaFisica();
		pessoaA.setNome("Diego Farias da Silva");
		pessoaA.getInvestimentos().add(investimento);

		PessoaFisica pessoaB = new PessoaFisica();
		pessoaB.setNome("Juquinha");
		investimento.setPessoa(pessoaB);

		new PessoaFisicaService().salvar(pessoaA);
		new PessoaFisicaService().salvar(pessoaB);
		new InvestimentoService().salvar(investimento);
	}
}
