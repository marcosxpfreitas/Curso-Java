package com.dextrainning.banco.telefone;

import javax.persistence.Entity;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Telefone extends Entidade {

	private String numero;
	private TipoTelefone tipo;

	protected Telefone() {
	}

	public Telefone(String numero, TipoTelefone tipo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
}
