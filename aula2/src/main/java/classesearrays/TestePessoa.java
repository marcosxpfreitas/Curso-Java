package classesearrays;

import java.util.Scanner;

public class TestePessoa {
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		String nome,CPF,rg;
		
		System.out.println("Digite seu nome");
		nome = ler.next();
		System.out.println("Digite seu CPF");
		CPF = ler.next();
		System.out.println("Digite seu RG");
		rg = ler.next();
		
		Pessoa pessoaA = new Pessoa(nome,CPF,rg);
		
		System.out.println(pessoaA);
		
		ler.close();
	}

}
