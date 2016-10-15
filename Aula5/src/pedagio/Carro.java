package pedagio;

public class Carro extends Veiculo implements PagaPedagio {
	
	public Carro(String modelo,String cor, int eixos){
		super(modelo, cor, eixos);
	}
	public int QuantidadeEixos() {
		return this.getEixos();
		
	}
	

}
