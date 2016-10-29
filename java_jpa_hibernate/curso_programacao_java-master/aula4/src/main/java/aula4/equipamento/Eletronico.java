package aula4.equipamento;

public class Eletronico extends Equipamento {

	public Eletronico(String fabricante, double preco) {
		super(fabricante, preco);
	}

	@Override
	public double calcularPrecoFinal() {
		return super.getPreco() * 1.1;
	}
}
