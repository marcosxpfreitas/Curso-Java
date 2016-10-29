package exemplos;

import java.util.Scanner;

/**
 * Mostra o resultado de uma comparacao
 */
public class VerificaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a idade:");
		int idade = scanner.nextInt();

		boolean resultado = idade >= 18;
		System.out.println(resultado);

		scanner.close();
	}
}
