package com.dextrainning.banco;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dextrainning.infra.jpa.Entidade;

@Entity
@Table(name = "servico_bancario")
public class ServicoBancario extends Entidade {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
