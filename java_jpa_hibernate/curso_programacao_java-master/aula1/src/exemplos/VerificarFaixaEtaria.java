package exemplos;

import java.util.Scanner;

/**
 * Exemplo basico de utilizacao de if-else if-else.
 *
 */
public class VerificarFaixaEtaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();

		if (idade < 12) {
			System.out.println("Criança!");
		} else if (idade < 18) {
			System.out.println("Adolescente!");
		} else {
			System.out.println("Adulto!");
		}
		scanner.close();
	}
}
