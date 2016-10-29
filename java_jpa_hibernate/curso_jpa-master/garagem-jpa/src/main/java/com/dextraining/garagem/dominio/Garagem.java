package com.dextraining.garagem.dominio;

import java.util.List;

import com.dextraining.garagem.dominio.veiculo.Veiculo;

public interface Garagem {

	public boolean adicionar(Veiculo veiculo);

	public boolean vender(String placa);

	public Veiculo buscar(String placa);

	public List<Veiculo> listar();
}