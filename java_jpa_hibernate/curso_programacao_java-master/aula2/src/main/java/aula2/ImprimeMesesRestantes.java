package aula2;

import java.util.Scanner;

/**
 * Faça um programa que receba um número inteiro que representa um dia da semana
 * e imprima esse dia por extenso usando a seguinte regra:<br>
 * 
 * Se 1, então imprima Segunda<br>
 * Se 2, então imprima Terça<br>
 * Se 3, então imprima Quarta<br>
 * Se 4, então imprima Quinta<br>
 * Se 5, então imprima Sexta<br>
 * Se 6, então imprima Sábado<br>
 * Se 7, então imprima Domingo<br>
 * 
 * Seu programa deve imprimir apenas o nome do dia informado e “Dia inválido”
 * caso o usuário informe algum outro número.
 * 
 * 
 * @author diego
 *
 */
public class ImprimeMesesRestantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um numero inteiro: ");
		int diaSemana = scanner.nextInt();

		/**
		 * Switch para verificar qual foi o dia da semana informado e mostrar os
		 * meses restantes. Repare que não existe "break" nos cases para que ao
		 * chegar correspondente ao valor informado os cases seguintes também
		 * sejam executados. Assim, todos os meses até o ultimo serão impressos
		 * (ultimo possui break para nao executar o default")
		 */
		switch (diaSemana) {
		case 1:
			System.out.println("Janeiro");
		case 2:
			System.out.println("Fevereiro");
		case 3:
			System.out.println("Marco");
		case 4:
			System.out.println("Abril");
		case 5:
			System.out.println("Maio");
		case 6:
			System.out.println("Junho");
		case 7:
			System.out.println("Julho");
		case 8:
			System.out.println("Agosto");
		case 9:
			System.out.println("Setembro");
		case 10:
			System.out.println("Outubro");
		case 11:
			System.out.println("Novembro");
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês invalido!");
			break;
		}
		scanner.close();
	}
}
