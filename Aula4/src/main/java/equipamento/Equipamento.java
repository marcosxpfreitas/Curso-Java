package equipamento;

public class Equipamento {
	private String fabricante;
	private double preco;

	
	public Equipamento (String fabricante,double preco){
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFabricante(){
		return this.fabricante;
	}
	public void serFabricante(String fabricante){
		this.fabricante=fabricante;
	}
	public double calculaPrecoFinal(){
		return this.preco;
	}
	
}