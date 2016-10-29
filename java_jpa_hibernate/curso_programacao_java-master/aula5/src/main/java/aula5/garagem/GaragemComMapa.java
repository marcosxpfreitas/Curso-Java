package aula5.garagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GaragemComMapa implements Garagem {

	private Map<String, Veiculo> veiculos;

	public GaragemComMapa() {
		this.veiculos = new HashMap<>();
	}

	@Override
	public boolean adicionar(Veiculo veiculo) {
		if (veiculos.containsKey(veiculo.getPlaca())) {
			return false;
		}
		veiculos.put(veiculo.getPlaca(), veiculo);
		return true;
	}

	@Override
	public boolean vender(String placa) {
		if (!veiculos.containsKey(placa)) {
			return false;
		}
		veiculos.remove(placa);
		return true;
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
