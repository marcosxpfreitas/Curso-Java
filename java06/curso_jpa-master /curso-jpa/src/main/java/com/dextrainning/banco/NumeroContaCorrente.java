package com.dextrainning.banco;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NumeroContaCorrente {

	@Column(length = 10)
	private String numero;

	@Column(name = "digito_verificador", length = 1)
	private String digitoVerificador;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
}
