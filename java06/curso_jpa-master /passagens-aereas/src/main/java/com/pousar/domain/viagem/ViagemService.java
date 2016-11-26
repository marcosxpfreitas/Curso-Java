package com.pousar.domain.viagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pousar.domain.ValidacaoException;
import com.pousar.jpa.BaseService;

public class ViagemService extends BaseService<Viagem> {

	public ViagemService() {
		super(Viagem.class);
	}

	@Override
	public Viagem salvar(Viagem entidade) {
		if(entidade.getIda()==null){
			throw new ValidacaoException("Preencha a data de ida");
		}
		if(entidade.getVolta()==null){
			throw new ValidacaoException("Preencha a data de volta");
		}
		if(entidade.getPreco()<=0){
			throw new ValidacaoException("Preencha o valor da viagem");
		}
		return super.salvar(entidade);
		
		// TODO: Implementar validacoes e salvar no banco de dados.
	}

	public List<Viagem> buscarPor(String origem, String destino, Date dataSaida, Date dataVolta) {
		/**
		 * TODO: Metodo que deve buscar uma viagem por origem, destino e datas.
		 */
		return new ArrayList<>();
	}
}
