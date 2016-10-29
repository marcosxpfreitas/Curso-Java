package exemplos;

import java.util.Scanner;

/**
 * Exercicio para utilizacao dos operacores aritmeticos
 *
 */
public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero1 = scanner.nextDouble();
		double numero2 = scanner.nextDouble();

		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));

		scanner.close();
	}
}
