package aula2;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Faça um programa que simule um pequeno jogo de adivinhação. Seu programa deve
 * gerar um número aleatório entre 1 e 10 e esperar “chutes” do usuário até que
 * ele acerte. A cada erro seu programa deve mostrar a mensagem “Chute errado,
 * tente novamente”. Quando o usuário acertar seu programa deve mostrar: “Vc
 * acertou em {X} tentativas”. Para gerar o número aleatório utilize o código
 * abaixo: int numero = new Random().nextInt(10) + 1;
 * 
 * @author diego
 *
 */
public class JogoAdivinhacaoDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int numeroAleatorio = new Random().nextInt(10) + 1;
		// Inicia com 0 por que o do-while será executado ao menos uma vez
		int quantidadeChutes = 0;

		do {
			System.out.println("Chute: ");
			numero = scanner.nextInt();
			quantidadeChutes++;

			/**
			 * Verifica se o usuario errou para imprimir a mensagem.
			 */
			if (numero != numeroAleatorio) {
				System.out.println("Chute errado, tente novamente!");
			}
		} while (numero != numeroAleatorio);

		/**
		 * Se saiu do laço, que dizer que o usuário acertou.
		 */
		System.out.println("Vc acertou em " + quantidadeChutes + " tentativas");
		scanner.close();
	}
}
