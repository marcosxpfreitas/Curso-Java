package com.dextraining.garagem.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.dominio.veiculo.VeiculoComparator;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemComSet implements Garagem {

	private Set<Veiculo> veiculos;

	public GaragemComSet() {
		this.veiculos = new HashSet<>();
	}

	@Override
	public void adicionar(Veiculo veiculo) {
		boolean adicionou = veiculos.add(veiculo);
		if (!adicionou) {
			throw new VeiculoDuplicadoException();
		}
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
