package com.dextraining.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Exemplo de mapeamento de entidade. <br>
 * Utilize a anotacao @Entity para que sua classe seja considerada uma entidade
 * no banco de dados.
 *
 */
@Entity
public class Entidade {

	/**
	 * Toda entidade no JPA deve ter um atributo anotacom o @Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
