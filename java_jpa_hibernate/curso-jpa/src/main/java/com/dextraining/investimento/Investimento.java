package com.dextraining.investimento;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investimento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = true) 
	private String descricao;
	@Column(nullable = true) 
	private BigDecimal valor;
	@Column(nullable = true) 
	private BigDecimal rendimentoMensal;
	
	
	public Investimento(String descricao, BigDecimal valor, BigDecimal redimentoMensal){
		this.descricao=descricao;
		this.valor=valor;
		this.rendimentoMensal=redimentoMensal;
	}
	public Investimento(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getRendimentoMensal() {
		return rendimentoMensal;
	}
	public void setRendimentoMensal(BigDecimal rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
	
	
	
	
	
}
