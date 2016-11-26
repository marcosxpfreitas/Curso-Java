package com.dextrainning.banco.pessoa;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
