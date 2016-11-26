package com.dextrainning.banco;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.dextrainning.banco.endereco.Endereco;
import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Agencia extends Entidade {

	private String numero;

	@OneToOne
	private Endereco endereco;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
