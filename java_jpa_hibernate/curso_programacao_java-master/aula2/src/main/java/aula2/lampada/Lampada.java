package aula2.lampada;

public class Lampada {

	/**
	 * String sao inicializadas com o valor padrao (null). Como estamos
	 * recebendo os valores no construtor e atribuindo passarão a ter o valor
	 * recebido.
	 */
	String watts;
	String fabricante;

	/**
	 * Atributo para controlar se lampada esta ligada ou nao. Como é boolean,
	 * será inicializada com false (valor padrão).
	 */
	boolean ligada;

	/**
	 * Construtor da classe. Recebe a quantidade de watts e o fabricante da
	 * lampada.
	 * 
	 * Lembre se, a declaracao do construtor nao tem retorno e ele sempre tem o
	 * mesmo nome da classe.
	 * 
	 * @param watts
	 * @param fabricante
	 */
	public Lampada(String watts, String fabricante) {
		this.watts = watts;
		this.fabricante = fabricante;
	}

	public void ligar() {
		this.ligada = true;
		System.out.println("Ligada");
	}

	public void desligar() {
		this.ligada = false;
		System.out.println("Desligada");
	}

	public boolean estaLigada() {
		return this.ligada;
	}
}
