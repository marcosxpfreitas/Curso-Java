package CursoJava;

import java.util.Scanner;

public class JogoParOuImpar {
	public static void main (String args[]){
		int jogador1,jogador2;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual valor o jogador 1 mostrou?");
		jogador1 = ler.nextInt();
		System.out.println("Qual valor o jogador 2 mostrou?");
		jogador2 = ler.nextInt();
		
		System.out.println(((jogador1+jogador2)%2)==0? jogador1+jogador2 +
				" é PAR, JOGADOR 1 VENCEU!":jogador1+jogador2 +" é IMPAR, JOGADOR 2 VENCEU!");
	}
}
