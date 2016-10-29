package aula6.exceptions.pessoa;

import java.io.Serializable;

/**
 * 
 * Classe que representa uma pessoa no meu sistema.
 * 
 * @author Diego Farias
 * 
 */
public class Pessoa implements Serializable {
	/**
	 * Nome da pessoa
	 */
	private String nome;
	/**
	 * Sobrenome da pessoa
	 */
	private String sobrenome;
	/**
	 * Contato da pessoa
	 */
	private String contato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome
				+ ", contato=" + contato + "]";
	}
}
