package aula2.lampada;

public class Interruptor {

	Lampada lampada;

	/**
	 * Construtor da classe. Recebe um objeto do tipo lampada.
	 * 
	 * @param lampada
	 */
	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
	}

	public void apertar() {
		if (lampada.estaLigada()) {
			lampada.desligar();
		} else {
			lampada.ligar();
		}
	}
}
