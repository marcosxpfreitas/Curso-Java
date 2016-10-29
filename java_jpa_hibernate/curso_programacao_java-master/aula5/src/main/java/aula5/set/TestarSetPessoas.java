package aula5.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import aula5.pessoa.Pessoa;
import aula5.pessoa.PessoaPorCpfComparator;

public class TestarSetPessoas {

	public static void main(String[] args) {
		// Hashset considera apenas equals e hascode
		Set<Pessoa> pessoas = new HashSet<>();

		pessoas.add(new Pessoa("Julia", "3"));
		pessoas.add(new Pessoa("Manoela", "5"));
		pessoas.add(new Pessoa("Flavia", "2"));
		pessoas.add(new Pessoa("Juquinha", "1"));
		pessoas.add(new Pessoa("Marcio", "4"));
		pessoas.add(new Pessoa("Jose", "2"));

		pessoas.remove(new Pessoa("Manoela", "5"));

		System.out.println("pessoas: ");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
		}
		// TreeSet considera equals, hashCode e compareTo para verificar duplicidade
		Set<Pessoa> pessoasOrdenadas = new TreeSet<>(
				new PessoaPorCpfComparator());
		pessoasOrdenadas.add(new Pessoa("Julia", "3"));
		pessoasOrdenadas.add(new Pessoa("Manoela", "5"));
		pessoasOrdenadas.add(new Pessoa("Flavia", "2"));
		pessoasOrdenadas.add(new Pessoa("Juquinha", "1"));
		pessoasOrdenadas.add(new Pessoa("Marcio", "4"));
		pessoasOrdenadas.add(new Pessoa("Jose", "2"));

		System.out.println("pessoasOrdenadas: ");
		for (Pessoa pessoa : pessoasOrdenadas) {
			System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
		}
	}
}
