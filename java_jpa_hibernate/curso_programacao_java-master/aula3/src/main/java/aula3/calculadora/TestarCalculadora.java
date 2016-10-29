package aula3.calculadora;

import java.util.Scanner;

public class TestarCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double primeiroNumero = scanner.nextDouble();
		scanner.nextLine(); // Para consumir o enter antes de ler o sinal
		String sinal = scanner.nextLine();
		double segundoNumero = scanner.nextDouble();

		Calculadora calculadora = new Calculadora();

		switch (sinal) {
		case "+":
			System.out.println(calculadora.somar(primeiroNumero, segundoNumero));
			break;
		case "-":
			System.out.println(calculadora.subtrair(primeiroNumero, segundoNumero));
			break;
		case "*":
			System.out.println(calculadora.multiplicar(primeiroNumero, segundoNumero));
			break;
		case "/":
			System.out.println(calculadora.dividir(primeiroNumero, segundoNumero));
			break;
		default:
			System.out.println("Operacao invalida!");
			break;
		}
		scanner.close();
	}
}
