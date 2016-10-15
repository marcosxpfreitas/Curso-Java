package ExercicioGaragem;

import java.util.Comparator;

import aula5.list.Pessoa;

public class VeiculoPlacaComparator implements Comparator<Veiculo>{

	@Override
	public int compare(Veiculo veiculo1, Veiculo veiculo2) {
		return veiculo1.getPlaca().compareTo(veiculo2.getPlaca());
	}

}
