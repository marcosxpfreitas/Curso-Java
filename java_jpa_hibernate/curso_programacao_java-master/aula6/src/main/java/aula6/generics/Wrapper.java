package aula6.generics;

public class Wrapper<TIPO_DADO> {

	private TIPO_DADO valor;

	public Wrapper(TIPO_DADO valor) {
		this.valor = valor;
	}
	
	public TIPO_DADO getValor() {
		return valor;
	}
}