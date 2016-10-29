package aula6.exceptions;

public class ErroValidacao extends Exception {

	private String nomeCampo;

	public ErroValidacao(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}
	
	public String getNomeCampo() {
		return nomeCampo;
	}
}
