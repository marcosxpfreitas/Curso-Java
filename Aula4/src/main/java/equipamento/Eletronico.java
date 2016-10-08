package equipamento;

public class Eletronico extends Equipamento {
	
	Eletronico(String fabricante, double preco){
		super(fabricante,preco);
	}
	
	@Override
	public double calculaPrecoFinal(){
		return this.getPreco()*1.10;
	}
	

}
