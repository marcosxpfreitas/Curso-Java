package aula5.list;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import aula5.pessoa.Pessoa;
import aula5.pessoa.PessoaPorCpfComparator;
import aula5.pessoa.PessoaPorNomeComparator;

public class TestarListaPessoas {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoaParaBusca = new Pessoa("Manoela", "5");

		pessoas.add(new Pessoa("Julia", "3"));
		pessoas.add(new Pessoa("Manoela", "5"));
		pessoas.add(new Pessoa("Juquinha", "1"));
		pessoas.add(new Pessoa("Marcio", "4"));
		pessoas.add(new Pessoa("Flavia", "2"));

		// Para funcionar corretamente precisa que equals seja implementado
		boolean contains = pessoas.contains(pessoaParaBusca);
		// Para funcionar corretamente precisa que equals seja implementado
		int indexOf = pessoas.indexOf(pessoaParaBusca);

		pessoas.remove(0);
		pessoas.remove(pessoaParaBusca);

		// Collections.sort(pessoas);
		// Collections.sort(pessoas, new PessoaPorCpfComparator());
		Collections.sort(pessoas, new PessoaPorNomeComparator());

		System.out.println("indexOf Manoela: " + indexOf);
		System.out.println("contains Manoela: " + contains);
		System.out.println("pessoas.size: " + pessoas.size());
		System.out.println("pessoas.isEmpty: " + pessoas.isEmpty());

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
		}
	}
}
