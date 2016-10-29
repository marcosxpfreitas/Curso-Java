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
public class JogoAdivinhacaoFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeChutes;
		int numeroAleatorio = new Random().nextInt(10) + 1;

		System.out.println("Chute: ");
		int numero = scanner.nextInt();

		/**
		 * for(inicializacao; condicao; incremento)
		 */
		for (quantidadeChutes = 1; numero != numeroAleatorio; quantidadeChutes++) {
			System.out.println("Chute errado, tente novamente!");
			System.out.println("Chute: ");
			numero = scanner.nextInt();
		}
		System.out.println("Vc acertou em " + quantidadeChutes + " tentativas");
		scanner.close();
	}
}
