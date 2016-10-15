package aula5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarListaPessoas {
	public static void main(String args[]){
		List<Pessoa> pessoas= new ArrayList<Pessoa>();
		
		

		
		pessoas.add(new Pessoa("Marcos","45594286896"));
		pessoas.add(new Pessoa("Jeffão","45594286896"));
		pessoas.add(new Pessoa("Diego","45594286896"));
		pessoas.add(new Pessoa("Maria Fita","45594286896"));
		boolean constains = pessoas.contains(new Pessoa("Marcos","45594286896"));
		int indexOf = pessoas.indexOf(new Pessoa("Marcos","45594286896"));
		System.out.println(pessoas.size());
		System.out.println(pessoas.isEmpty());
		
		
		
		//Collections sort Pessoas.
		
		Collections.sort(pessoas, new PessoaCpfComparator()); // comparator 
		for (Pessoa pessoa: pessoas){
			System.out.println(pessoa.getNome()+" "+pessoa.getCpf());
		}
		
		System.out.println(constains);
		System.out.println(indexOf);
		
		Collections.sort(pessoas); // comparable 
		
		
		for (Pessoa pessoa: pessoas){
			System.out.println(pessoa.getNome()+" "+pessoa.getCpf());
		}
		
		
	}

}
