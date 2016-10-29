package exemplos;

import java.util.Scanner;

/**
 * Comparacao de string usando o metodo equals ao inves do operador ==. Como
 * visto, quando os operados sao objetos o operador == compara as intancias e
 * nao o conteudo.
 * 
 */
public class ComparaStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro nome:");
		String nome1 = scanner.nextLine();

		System.out.println("Informe o segundo nome:");
		String nome2 = scanner.nextLine();

		scanner.close();

		System.out.println(nome1.equals(nome2));
	}
}
