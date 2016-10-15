package pedagio;

public class Moto extends Veiculo implements PagaPedagio{
	public Moto(String modelo, String cor, int eixos){
		super(modelo,cor,eixos);
	}
	public int QuantidadeEixos() {
		return this.getEixos();
		
	}
}
