package aula3.carro;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private int anoFabricação;
	private int velocidade;

	public Carro(String marca, String modelo, String cor, int anoFabricação) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricação = anoFabricação;
	}

	public void acelerar() {
		this.velocidade++;
	}

	public void frear() {
		if (this.velocidade > 0) {
			this.velocidade--;
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getAnoFabricação() {
		return anoFabricação;
	}

	public int getVelocidade() {
		return velocidade;
	}
}
