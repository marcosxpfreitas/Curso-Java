package com.dextraining.garagem.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.dominio.veiculo.VeiculoComparator;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemComMapa implements Garagem {

	private Map<String, Veiculo> veiculos;

	public GaragemComMapa() {
		this.veiculos = new HashMap<>();
	}

	@Override
	public void adicionar(Veiculo veiculo) {
		if (veiculos.containsKey(veiculo.getPlaca())) {
			throw new VeiculoDuplicadoException();
		}
		veiculos.put(veiculo.getPlaca(), veiculo);
	}

	@Override
	public void vender(String placa) {
		if (!veiculos.containsKey(placa)) {
			throw new VeiculoNaoEncontradoException();
		}
		veiculos.remove(placa);
	}

	@Override
	public Veiculo buscar(String placa) {
		return veiculos.get(placa);
	}

	@Override
	public List<Veiculo> listar() {
		List<Veiculo> veiculosOrdenados = new ArrayList<>(veiculos.values());
		Collections.sort(veiculosOrdenados, new VeiculoComparator());
		return veiculosOrdenados;
	}
}
