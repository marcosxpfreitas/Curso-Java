package com.pousar.domain.viagem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.pousar.jpa.Entidade;
@Entity
public class Voo extends Entidade {
	
	
	@Column(nullable=false,length=40)
	private String origem;
	@Column(nullable=false,length=40)
	private String destino;
	@Column(nullable=false,length=15)
	private Date dataHoraSaida;
	@Column(nullable=false,length=15)
	private Date dataHoraChegada;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(Date dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

	public Date getDataHoraChegada() {
		return dataHoraChegada;
	}

	public void setDataHoraChegada(Date dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}
}