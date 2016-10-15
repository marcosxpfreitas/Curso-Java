package aula5.list;

import java.util.Comparator;

public class PessoaCpfComparator implements Comparator<Pessoa>{

	//classe que faz comparação entre dois objetos do mesmo tipo. (String);
	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return pessoa.getCpf().compareTo(outraPessoa.getCpf());
	}


}
