package aula2;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro e imprima os números pares entre
 * 1 e esse número. Como restrição, seu programa pode imprimir no máximo 10
 * números. Portanto, se o número informado for grande seu programa deve sair
 * após imprimir os 10 primeiros números pares.
 * 
 * @author diego
 *
 */
public class ImprimirPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		int numero = scanner.nextInt();
		int quantidadePares = 0;

		/**
		 * Executa o for entre 1 e o número informado. O código comentado tem o
		 * mesmo resultado que o break abaixo.
		 */
		for (int i = 1; i <= numero /* && quantidadePares <= 10 */; i++) {
			if (i % 2 == 0) {
				// Incrementa o contador do numero de pares impressos
				quantidadePares++;
				System.out.println(i);
			}
			/**
			 * Caso tenha impresso 10 pares, sai do laco.
			 */
			if (quantidadePares == 10) {
				break;
			}
		}
		scanner.close();
	}
}
