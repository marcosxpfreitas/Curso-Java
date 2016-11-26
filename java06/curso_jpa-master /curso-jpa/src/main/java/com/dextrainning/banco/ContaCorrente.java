package com.dextrainning.banco;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class ContaCorrente extends Entidade {

	@ManyToOne
	private Banco banco;

	@Embedded
	private NumeroContaCorrente numero;

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public NumeroContaCorrente getNumero() {
		return numero;
	}

	public void setNumero(NumeroContaCorrente numero) {
		this.numero = numero;
	}
}
