package aula2;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de dois times de futebol, uma quantidade N
 * de jogos entre dois times de futebol e os resultados desses jogos. Seu
 * programa deve imprimir o saldo de gols (marcados - sofridos), o número de
 * vitórias e o nome do time que venceu mais jogos.
 * 
 * @author diego
 *
 */
public class TimesFutebol {

	public static void main(String[] args) {
		int quantidadeJogos;

		/**
		 * Nomes dos times
		 */
		String nomePrimeiroTime;
		String nomeSegundoTime;

		/**
		 * Saldo de gols dos times
		 */
		int saldoPrimeiroTime = 0;
		int saldoSegundoTime = 0;

		/**
		 * Vitorias dos times
		 */
		int vitoriasPrimeiroTime = 0;
		int vitoriasSegundoTime = 0;

		/**
		 * Gols marcados nos jogos
		 */
		int golsPrimeiroTime;
		int golsSegundoTime;

		/**
		 * Le o nome dos times
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome do primeiro time: ");
		nomePrimeiroTime = scanner.nextLine();

		System.out.println("Nome do segundo time: ");
		nomeSegundoTime = scanner.nextLine();

		/**
		 * Le a quantidade de jogos
		 */
		System.out.println("Quantidade de jogos: ");
		quantidadeJogos = scanner.nextInt();

		/**
		 * Le o resultado para cada um dos jogos e realiza
		 */
		for (int i = 1; i <= quantidadeJogos; i++) {
			/**
			 * Le os gos do jogo
			 */
			System.out.println("Jogo " + i + ": ");
			System.out.println("Gols do primeiro time: ");
			golsPrimeiroTime = scanner.nextInt();

			System.out.println("Gols do segundo time: ");
			golsSegundoTime = scanner.nextInt();

			/**
			 * Computa o saldo de cada um dos times subtraindo os gols do jogo.
			 */
			saldoPrimeiroTime += (golsPrimeiroTime - golsSegundoTime);
			saldoSegundoTime += (golsSegundoTime - golsPrimeiroTime);

			/**
			 * Se o primeiro time fez mais gols nesse jogo, entao ele venceu.
			 * Incrementa o numero de vitorias
			 */
			if (golsPrimeiroTime > golsSegundoTime) {
				vitoriasPrimeiroTime++;
			}
			/**
			 * Se o segundo time fez mais gols nesse jogo, entao ele venceu.
			 * Incrementa seu numero de vitorias
			 */
			else if (golsSegundoTime > golsPrimeiroTime) {
				vitoriasSegundoTime++;
			}
			/**
			 * Senao, jogo deu empate. Nesse exemplo nao faremos nada em caso de
			 * empate.
			 */
			else {
			}
		}
		scanner.close();

		/**
		 * Verifica qual time teve mais vitorias
		 */
		if (vitoriasPrimeiroTime > vitoriasSegundoTime) {
			System.out.println("Vencedor: " + nomePrimeiroTime);
			System.out.println("Vitorias: " + vitoriasPrimeiroTime);
			System.out.println("Saldo de gols: " + saldoPrimeiroTime);

		} else if (vitoriasSegundoTime > vitoriasPrimeiroTime) {
			System.out.println("Vencedor: " + nomeSegundoTime);
			System.out.println("Vitorias: " + vitoriasSegundoTime);
			System.out.println("Saldo de gols: " + saldoSegundoTime);
		} else {
			System.out.println("Numero de vitorias igual");
		}
	}
}
