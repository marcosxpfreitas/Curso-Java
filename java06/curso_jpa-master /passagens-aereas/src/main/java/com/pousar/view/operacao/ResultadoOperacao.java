package com.pousar.view.operacao;

public abstract class ResultadoOperacao {

	protected TipoResultadoOperacao status;

	protected ResultadoOperacao(TipoResultadoOperacao status) {
		this.status = status;
	}

	public TipoResultadoOperacao getStatus() {
		return status;
	}
}
