package CursoJava;

import java.util.Scanner;

public class OperadoresAritimeticos {
	public static void main (String args[]){
		double valor1,valor2;
		Scanner ler = new Scanner(System.in);
		System.out.println("Esse programa mostrará todos os operadores aritiméticos");
		System.out.println("Digite o primeiro número: ");
		valor1 = ler.nextDouble();
		System.out.println("Digite o segundo número: ");
		valor2 = ler.nextDouble();
		if (valor2 == 0){
			System.out.println("Segundo número deve ser maior que zero.");
		}else{
		System.out.println("Soma = "+valor1+" + "+valor2+" = "+(valor1+valor2));
		System.out.println("Subtração = "+valor1+" - "+valor2+" = "+(valor1-valor2));
		System.out.println("Multiplicação = "+valor1+" * "+valor2+" = "+(valor1*valor2));
		System.out.println("Divisão = "+valor1+" / "+valor2+" = "+(valor1/valor2));
		System.out.println("Resto da divisão = "+valor1+" % "+valor2+" = "+(valor1%valor2));
		}
		
		
	}
}
