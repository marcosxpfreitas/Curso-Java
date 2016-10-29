package aula5.garagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GaragemComSet implements Garagem {

	private Set<Veiculo> veiculos;

	public GaragemComSet() {
		this.veiculos = new HashSet<>();
	}

	@Override
	public boolean adicionar(Veiculo veiculo) {
		return veiculos.add(veiculo);
	}

	@Override
	public boolean vender(String placa) {
		Veiculo veiculo = buscar(placa);
		if (veiculo == null) {
			return false;
		}
		veiculos.remove(veiculo);
		return true;
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
