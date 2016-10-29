package aula5.garagem;

import java.util.Comparator;

public class VeiculoComparator implements Comparator<Veiculo> {

	@Override
	public int compare(Veiculo veiculo, Veiculo outroVeiculo) {
		// marca, modelo, ano e preço.
		int resultado = veiculo.getMarca().compareTo(outroVeiculo.getMarca());

		if (resultado == 0) {
			resultado = veiculo.getModelo().compareTo(outroVeiculo.getModelo());
		}
		if (resultado == 0) {
			resultado = veiculo.getAno() - outroVeiculo.getAno();
		}
		if (resultado == 0) {
			resultado = Double.compare(veiculo.getPreco(), outroVeiculo.getPreco());
		}
		return resultado;
	}
}
