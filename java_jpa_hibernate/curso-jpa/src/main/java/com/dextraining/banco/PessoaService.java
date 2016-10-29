package com.dextraining.banco;


import com.dextraining.pessoa.Pessoa;
import com.dextraining.service.GenericService;

public class PessoaService extends GenericService<Pessoa> {
	public PessoaService(){
		super(Pessoa.class);
	
	}
}
