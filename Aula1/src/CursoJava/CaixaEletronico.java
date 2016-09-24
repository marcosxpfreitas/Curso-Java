package CursoJava;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main (String args[]){
		int cont100=0, cont50=0, cont20=0, cont10=0, cont5=0;
		int valor,valorDigitado; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja sacar:");
		valorDigitado = ler.nextInt();
		valor = valorDigitado;
		if ((valor/100)>0){
		cont100 = valor/100;
		valor = valor%100;
		}
		if((valor/50)>0){
			cont50 = valor/50;
			valor = valor%50;
		}
		if((valor/20)>0){
			cont20 = valor/20;
			valor = valor%20;
		}
		if((valor/10)>0){
			cont10 = valor/10;
			valor = valor%10;
		}
		if((valor/5)>0){
			cont5 = valor/5;
			valor = valor%5;
		}
		if((valor%5)>0){
			System.out.println("Impossível sacar o valor de R$ "+valorDigitado+".");
		}else
		{
			System.out.println("R$100 = "+cont100);
			System.out.println("R$50 = "+cont50);
			System.out.println("R$20 = "+cont20);
			System.out.println("R$10 = "+cont10);
			System.out.println("R$5 = "+cont5);
			
		}
		
			
	}
}

