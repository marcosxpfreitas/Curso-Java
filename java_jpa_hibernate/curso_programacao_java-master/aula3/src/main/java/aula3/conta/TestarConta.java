package aula3.conta;

import java.util.Scanner;

/**
 * 
 * Faça um programa que realize operações em uma conta bancária. Seu programa
 * deve realizar depósitos, saques e consultas de saldo. <br>
 * 
 * Crie uma classe Conta para concentrar a implementação das funcionalidades e
 * uma classe executável para imprimir o menu de opções:<br>
 * 
 * Sacar [solicitar valor e realizar saque]<br>
 * Depositar [solicitar valor e realizar depósito]<br>
 * Ver saldo [mostrar valor atual do saldo]<br>
 * 
 * Premissas:<br>
 * Se o saque não for possível seu programa deve mostrar “Saldo
 * insuficiente”;<br>
 * A classe conta deve possuir os métodos sacar, depositar, obterSaldo.
 * Verifique quais os parâmetros e retornos seus métodos terão.<br>
 * 
 * 
 * @author diego
 *
 */
public class TestarConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Conta conta = new Conta();
		int opcao = menu(scanner);
		while (opcao != 4) {
			if (opcao == 1) {
				double valor = lerValor("Valor do saque: ", scanner);
				boolean sacou = conta.sacar(valor);
				if (!sacou) {
					System.out.println("Saldo insuficiente!");
				}
			} else if (opcao == 2) {
				double valor = lerValor("Valor do deposito: ", scanner);
				conta.depositar(valor);
			} else if (opcao == 3) {
				System.out.println("Saldo atual: " + conta.getSaldo());
			} else {
				System.out.println("Opcao inválida!");
			}
			opcao = menu(scanner);
		}
		scanner.close();
	}

	/**
	 * Método auxiliar para ler valores
	 * 
	 * @param mensagem
	 * @param scanner
	 * @return
	 */
	private static double lerValor(String mensagem, Scanner scanner) {
		System.out.println(mensagem);
		double valor = scanner.nextDouble();
		return valor;
	}

	/**
	 * Metodo que imprime menu e le opcao do usuario
	 * 
	 * @param scanner
	 * @return
	 */
	private static int menu(Scanner scanner) {
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Sair");

		return scanner.nextInt();
	}
}
