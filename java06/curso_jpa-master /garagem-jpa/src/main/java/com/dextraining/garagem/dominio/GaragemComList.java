package com.dextraining.garagem.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.dominio.veiculo.VeiculoComparator;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemComList implements Garagem {

	private List<Veiculo> veiculos;

	public GaragemComList() {
		this.veiculos = new ArrayList<>();
	}

	@Override
	public void adicionar(Veiculo veiculo) {
		Veiculo veiculoEncontrado = buscar(veiculo.getPlaca());
		if (veiculoEncontrado != null) {
			throw new VeiculoDuplicadoException();
		}
		veiculos.add(veiculo);
	}

	@Override
	public void vender(String placa) {
		Veiculo veiculo = buscar(placa);
		if (veiculo == null) {
			throw new VeiculoNaoEncontradoException();
		}
		veiculos.remove(veiculo);
	}

	@Override
	public Veiculo buscar(String placa) {
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(placa)) {
				return veiculo;
			}
		}
		return null;
	}

	@Override
	public List<Veiculo> listar() {
		List<Veiculo> veiculosOrdenados = new ArrayList<>(veiculos);
		Collections.sort(veiculosOrdenados, new VeiculoComparator());
		return veiculosOrdenados;
	}
}
