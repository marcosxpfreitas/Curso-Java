package com.dextraining.garagem.dominio;

import java.util.ArrayList;
import java.util.List;

import com.dextraining.garagem.dominio.veiculo.Veiculo;

public class GaragemJPA implements Garagem {

	@Override
	public boolean adicionar(Veiculo veiculo) {
		// TODO Salvar novo veiculo no banco de dados
		// TODO IMPORTANTE: Validar duplicidade da placa do veiculo
		return false;
	}

	@Override
	public boolean vender(String placa) {
		// TODO Implementar venda de veiculo por placa
		return false;
	}

	@Override
	public Veiculo buscar(String placa) {
		// TODO Implementar busca de veiculo por placa
		return null;
	}

	@Override
	public List<Veiculo> listar() {
		// TODO: Implementar consulta que lista todos os veiculos ordenados por:
		// marca;
		// modelo;
		// ano;
		// preco;

		return new ArrayList<>();
	}

}
