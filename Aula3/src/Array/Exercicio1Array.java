package Array;

import java.util.Scanner;

public class Exercicio1Array {
	public static void main(String args[]){
		int[] arrayNumeros = new int[10];
		int numeroInfo;
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < arrayNumeros.length;i++ ){
			System.out.println("Número para a posição "+i+" do array:");
			numeroInfo = ler.nextInt();
			arrayNumeros[i]=numeroInfo;
		}
		
		System.out.println("***LAÇO FOR***");
		for (int i =0; i < arrayNumeros.length;i++){
			System.out.println(arrayNumeros[i]);
		}
		
		System.out.println("***LAÇO FOR-EACH");
		for (int numero:arrayNumeros){
			System.out.println(numero);
		}
	}
	
}
