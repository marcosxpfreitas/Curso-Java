package lacosderepeticao;

import java.util.Scanner;
import classesearrays.*;
//Código feito para exemplicar o laço de repetição Switch

public class DiaSemana {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7");
		int semana = ler.nextInt();
		switch(semana){
		case 1: {
			System.out.println("Domingo");
			break;
		}
		case 2: {
			System.out.println("Segunda");
			break;
		}
		case 3: {
			System.out.println("Terça");
			break;
		}
		case 4: {
			System.out.println("Quarta");
			break;
		}
		case 5: {
			System.out.println("Quinta");
			break;
		}
		case 6: {
			System.out.println("Sexta");
			break;
		}
		case 7: {
			System.out.println("Sabado");
			break;
		}
		default: {
			System.out.println("Valor inválido");
			break;
		}
		
		}
		
		
		ler.close(); 
		String nome="Marcos";
		String CPF="5454";
		String rg="454";
		
		Pessoa pessoa = new Pessoa(nome, CPF, rg);
		
	}
}
