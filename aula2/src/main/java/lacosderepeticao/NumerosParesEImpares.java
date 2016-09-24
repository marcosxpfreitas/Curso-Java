package lacosderepeticao;

import java.util.Scanner;

public class NumerosParesEImpares {

	public static void main(String[] args) {
		int contador;
		int contPar=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = ler.nextInt();
		for (contador = 1; contador < numero; contador++){
			if ((contador%2)==0){
				System.out.println(contador+" ");
				contPar++;
				if(contPar==10){
					break;
				}
				
			}
			ler.close();
		}
		
		

	}

}
