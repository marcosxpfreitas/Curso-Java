package aula6.enums;

public enum TipoPecaXadrez {
	PEAO ("Para frente"), 
	TORRE ("Linha reta"), 
	CAVALO ("Em L"), 
	BISPO ("Diagonal"), 
	RAINHA ("Todas direcoes"), 
	REI ("Uma casa");

	private String tipoMovimento;

	TipoPecaXadrez(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	
	public static TipoPecaXadrez fromIndex(int index) {
		return values()[index];
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}
}
