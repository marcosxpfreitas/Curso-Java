package main.java;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import aula5.list.Pessoa;
import aula5.list.PessoaCpfComparator;

public class TestarSetPessoas {
	public static void main (String args[]){
		Set<Pessoa> pessoas = new HashSet<>();
		
		pessoas.add(new Pessoa("Marcos","45594285896"));
		pessoas.add(new Pessoa("Jeffão","45594284896"));
		pessoas.add(new Pessoa("Diego","45594286296"));
		pessoas.add(new Pessoa("Maria Fita","45594286836"));
		pessoas.add(new Pessoa("Maria Fia","4559428636"));
		
		
		for (Pessoa valores : pessoas){
			System.out.println(valores.getNome()+" "+valores.getCpf());
			
		}
		Set<Pessoa> pessoasOrdenadas = new TreeSet<>();
		
		pessoasOrdenadas.add(new Pessoa("Marcos","45594285896"));
		pessoasOrdenadas.add(new Pessoa("Jeffão","45594284896"));
		pessoasOrdenadas.add(new Pessoa("Diego","45594286296"));
		pessoasOrdenadas.add(new Pessoa("Maria Fita","45594286836"));
		pessoasOrdenadas.add(new Pessoa("Maria Fia","4559428636"));
		
		System.out.println("ordenado");
		
		for (Pessoa valores : pessoasOrdenadas){
			System.out.println(valores.getNome()+" "+valores.getCpf());
			
		}
	
		
		
	}
}
