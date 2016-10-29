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
public class JogoAdivinhacaoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chute: ");
		int numero = scanner.nextInt();
		int numeroAleatorio = new Random().nextInt(10) + 1;
		int quantidadeChutes = 1;

		/**
		 * Enquanto o numero informado for diferente do numero aleatorio gerado,
		 * incrementa o numero de tentativas e lê o próximo chute.
		 */
		while (numero != numeroAleatorio) {
			System.out.println("Chute errado, tente novamente!");
			System.out.println("Chute: ");
			numero = scanner.nextInt();
			quantidadeChutes++;
		}
		/**
		 * Se saiu do laço, que dizer que o usuário acertou.
		 */
		System.out.println("Vc acertou em " + quantidadeChutes + " tentativas");
		scanner.close();
	}
}
