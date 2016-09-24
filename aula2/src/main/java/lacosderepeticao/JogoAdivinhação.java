package lacosderepeticao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int numero = new Random().nextInt(500)+1;
		int numeroDigitado=0;
		String resposta="SIM";
		int tentativas=0;
		do {
			System.out.println("***ADIVINHE O NÚMERO!!!***");
			System.out.println("Digite o número que eu estou pensando:");
			numeroDigitado = ler.nextInt();
			tentativas++;
			if (numeroDigitado != numero)
			{
				System.out.println("Você errou!");
				System.out.println("Você deseja continuar?");
				resposta = ler.next().toUpperCase();
				if (resposta.equals("NÃO"))
					System.out.println("Jogo encerrado\nTentativas = "+tentativas+ "\nO número era = "+numero);
				
			}else {
				System.out.println("Parabéns, você acertou em "+tentativas+" tentativas");
				System.out.println("Deseja tentar outra vez");
				resposta = ler.next().toUpperCase();
				if(resposta.equals("SIM")){
					numero = new Random().nextInt(10)+1;
					tentativas=0;
				}
			}
		}while (resposta.equals("SIM"));
		
	}

}
