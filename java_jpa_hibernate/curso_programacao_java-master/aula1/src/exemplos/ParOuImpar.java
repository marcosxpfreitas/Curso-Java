package exemplos;

import java.util.Scanner;

/**
 * Verifica quem ganhou um jogo de par ou impar usando operador condicional.
 */
public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String jogador1 = scanner.nextLine();
		String jogador2 = scanner.nextLine();

		int valor1 = scanner.nextInt();
		int valor2 = scanner.nextInt();

		int resultado = (valor1 + valor2) % 2;

		if (resultado == 0) {
			System.out.println("Jogador " + jogador1 + " venceu");
		} else {
			System.out.println("Jogador " + jogador2 + " venceu");
		}
		System.out.println("Encerrado!");

		scanner.close();
	}
}
