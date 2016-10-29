package aula5.pessoa;

import java.util.Comparator;

public class PessoaPorNomeComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return pessoa.getNome().compareTo(outraPessoa.getNome());
	}
}
