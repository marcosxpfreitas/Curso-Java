package exemplos;

import java.util.Scanner;

/**
 * Exemplo de utilizacao do operador de resto e estrutura condicional.
 *
 */
public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Valor do saque: ");

		int valorSaque = scanner.nextInt();
		int restante = valorSaque;

		int quantidadeNotas100 = restante / 100;
		restante = restante % 100;

		int quantidadeNotas50 = restante / 50;
		restante = restante % 50;

		int quantidadeNotas20 = restante / 20;
		restante = restante % 20;

		int quantidadeNotas10 = restante / 10;
		restante = restante % 10;

		int quantidadeNotas05 = restante / 5;
		restante = restante % 5;

		if (restante > 0) {
			System.out.println("Não é possível sacar o valor informado!");
		} else {
			if (quantidadeNotas100 > 0) {
				System.out.println(quantidadeNotas100 + " nota(s) de R$ 100");
			}
			if (quantidadeNotas50 > 0) {
				System.out.println(quantidadeNotas50 + " nota(s) de R$ 50");
			}
			if (quantidadeNotas20 > 0) {
				System.out.println(quantidadeNotas20 + " nota(s) de R$ 20");
			}
			if (quantidadeNotas10 > 0) {
				System.out.println(quantidadeNotas10 + " nota(s) de R$ 10");
			}
			if (quantidadeNotas05 > 0) {
				System.out.println(quantidadeNotas05 + " nota(s) de R$ 5");
			}
		}
		scanner.close();
	}
}
