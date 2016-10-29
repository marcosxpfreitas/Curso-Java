package aula3.jogovelha;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.mostrarTabuleiro();

		for (int linha = 0; linha < Tabuleiro.MAX_LINHAS; linha++) {
			for (int coluna = 0; coluna < Tabuleiro.MAX_LINHAS; coluna++) {
				char simbolo = scanner.nextLine().charAt(0);
				tabuleiro.marcarPosicao(linha, coluna, simbolo);
				tabuleiro.mostrarTabuleiro();
			}
		}
		System.out.println("Vencedor: " + tabuleiro.obterVencedor());
		scanner.close();
	}
}
