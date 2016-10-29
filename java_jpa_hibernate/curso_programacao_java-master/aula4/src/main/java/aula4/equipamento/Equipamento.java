package aula4.equipamento;

public class Equipamento {

	private String fabricante;
	private double preco;

	public Equipamento(String fabricante, double preco) {
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double calcularPrecoFinal() {
		return preco;
	}
}
