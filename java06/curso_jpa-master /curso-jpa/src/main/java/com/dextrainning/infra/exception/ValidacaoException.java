package com.dextrainning.infra.exception;

public class ValidacaoException extends RuntimeException {

	private static final long serialVersionUID = -363072178648268503L;

	public ValidacaoException(String mensagem) {
		super(mensagem);
	}
}
