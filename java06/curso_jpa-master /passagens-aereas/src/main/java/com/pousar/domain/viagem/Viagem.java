package com.pousar.domain.viagem;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.pousar.jpa.Entidade;

@Entity
public class Viagem extends Entidade {
	
	@OneToOne
	private Voo ida;
	@OneToOne
	private Voo volta;
	private double preco;

	public Voo getIda() {
		return ida;
	}

	public void setIda(Voo ida) {
		this.ida = ida;
	}

	public Voo getVolta() {
		return volta;
	}

	public void setVolta(Voo volta) {
		this.volta = volta;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
