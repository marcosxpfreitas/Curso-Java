package aula2;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro correspondente a um mês do ano
 * (de 1 até 12) e imprima os nomes dos meses que faltam para o fim do ano
 * (incluindo o mês informado). Caso o usuário informe um mês inválido seu
 * programa deve imprimir “Mês inválido”. <br>
 * 
 * Ex.: Ao informar 10 seu programa deve imprimir: <br>
 * 
 * Outubro<br>
 * Novembro<br>
 * Dezembro<br>
 * 
 * 
 * @author diego
 *
 */
public class ImprimirDiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um numero inteiro: ");
		int diaSemana = scanner.nextInt();

		/**
		 * Switch simples para verificar qual o valor e imprimir o dia
		 * correspondente. Como só queremos imprimir o nome do dia informado,
		 * todos os cases possuem break.
		 */
		switch (diaSemana) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia Invalido!");
			break;
		}
		scanner.close();
	}
}
