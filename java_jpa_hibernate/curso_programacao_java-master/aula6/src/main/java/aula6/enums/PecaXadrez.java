package aula6.enums;

public class PecaXadrez {

	private int linha;
	private int coluna;
	private TipoPecaXadrez tipoPecaXadrez;

	public PecaXadrez(TipoPecaXadrez tipoPecaXadrez) {
		this.linha = 0;
		this.coluna = 0;
		this.tipoPecaXadrez = tipoPecaXadrez;
	}
	
	public TipoPecaXadrez getTipoPecaXadrez() {
		return tipoPecaXadrez;
	}
}
