package aula3.jogovelha;

public class Tabuleiro {

	public static final int MAX_COLUNAS = 3;
	public static final int MAX_LINHAS = 3;

	private char[][] jogadas;

	public Tabuleiro() {
		this.jogadas = new char[MAX_LINHAS][MAX_COLUNAS];
	}

	public void marcarPosicao(int linha, int coluna, char simbolo) {
		this.jogadas[linha][coluna] = simbolo;
	}

	public void mostrarTabuleiro() {
		for (int i = 0; i < jogadas.length; i++) {
			System.out.print("|");
			for (int j = 0; j < jogadas[i].length; j++) {
				char simbolo = (jogadas[i][j] == 0) ? ' ' : jogadas[i][j];
				System.out.print(simbolo);
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public char obterVencedor() {
		// TODO: Verificar ganhador na linha
		// TODO: Verificar ganhador na coluna
		// TODO: Verificar ganhador nas diagonais

		// TODO Auto-generated method stub
		return 0;
	}
}
