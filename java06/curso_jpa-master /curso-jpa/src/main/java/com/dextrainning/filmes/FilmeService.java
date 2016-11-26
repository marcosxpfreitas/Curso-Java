package com.dextrainning.filmes;

import com.dextrainning.infra.service.GenericService;

public class FilmeService extends GenericService<Filme> {

	public FilmeService() {
		super(Filme.class);
	}
}
