package com.dextrainning.banco.pessoa;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.dextrainning.infra.jpa.Entidade;

@MappedSuperclass
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "tipo")
public class Pessoa extends Entidade {

	@Column(length = 50, nullable = false)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
