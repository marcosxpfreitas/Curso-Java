package aula5.garagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GaragemComList implements Garagem {

	private List<Veiculo> veiculos;

	public GaragemComList() {
		this.veiculos = new ArrayList<>();
	}

	@Override
	public boolean adicionar(Veiculo veiculo) {
		Veiculo veiculoEncontrado = buscar(veiculo.getPlaca());
		if (veiculoEncontrado != null) {
			return false;
		}
		veiculos.add(veiculo);
		return true;
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
