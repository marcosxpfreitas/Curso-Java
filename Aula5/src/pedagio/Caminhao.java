package pedagio;

public class Caminhao extends Veiculo implements PagaPedagio {
	
	public Caminhao(String modelo, String cor, int eixos){
		super(modelo,cor,eixos);
	}
	public int QuantidadeEixos() {
		return this.getEixos();
		
	}

}
