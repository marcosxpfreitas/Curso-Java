package aula3.arrays;

import java.util.Scanner;

public class ImprimeArrayInvertido {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("N: ");
		int n = scanner.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[ " + i + " ] = ");
			numeros[i] = scanner.nextInt();
		}

		System.out.print("Arary invertido: ");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i]);
			System.out.print(" ");
		}
		scanner.close();
	}

}
