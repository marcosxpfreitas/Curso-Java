package com.dextrainning.banco;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Banco extends Entidade {

	@Column
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
