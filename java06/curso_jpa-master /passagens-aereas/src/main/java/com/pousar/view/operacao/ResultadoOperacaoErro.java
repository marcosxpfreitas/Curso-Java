package com.pousar.view.operacao;

import java.util.ArrayList;
import java.util.List;

public class ResultadoOperacaoErro extends ResultadoOperacao {

	private List<String> erros;

	public ResultadoOperacaoErro(String mensagem) {
		super(TipoResultadoOperacao.ERRO);
		this.erros = new ArrayList<>();
		this.erros.add(mensagem);
	}

	public List<String> getErros() {
		return erros;
	}
}
