package CursoJava;

import java.util.Scanner;

public class ExercicioParOuImpar {
	public static void main(String args[]){
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Descubra se um número é PAR ou IMPAR!!!");
		System.out.println("Please , digite um número:");
		numero = ler.nextInt();
		System.out.println((numero%2==0)? numero+" é PAR":numero+" é IMPAR");
	}
}
