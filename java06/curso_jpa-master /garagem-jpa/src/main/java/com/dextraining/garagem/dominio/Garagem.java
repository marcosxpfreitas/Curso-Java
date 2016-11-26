package com.dextraining.garagem.dominio;

import java.util.List;

import com.dextraining.garagem.dominio.veiculo.Veiculo;

public interface Garagem {

	public void adicionar(Veiculo veiculo);

	public void vender(String placa);

	public Veiculo buscar(String placa);

	public List<Veiculo> listar();
}