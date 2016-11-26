package com.dextrainning.banco.endereco;

import javax.persistence.Entity;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Endereco extends Entidade {

	private String cidade;
	private String estado;
	private String pais;
	private String logradouro;
	private int numero;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
