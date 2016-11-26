package com.dextrainning.filmes;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Filme extends Entidade {

	private String nome;
	private Date dataLancamento;

	@ManyToMany
	@JoinTable(inverseJoinColumns = @JoinColumn(name="categoria_id"))
	private List<Categoria> categorias;

	@ManyToOne
	private Diretor diretor;
	
	@ManyToMany
	private List<Ator> atores;

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
}
