package com.pousar.domain.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.pousar.jpa.Entidade;

/**
 * Classe que representa um usuario do sistema
 */
@Entity
public class Usuario extends Entidade {

	@Column(nullable=false,length=30)
	private String nome;
	@Column(unique=true, length=30)
	private String email;
	@Column(nullable=false,length=30)
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
