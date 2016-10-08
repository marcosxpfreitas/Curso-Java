package equipamento;

public class Televisao extends Eletronico {
	private int polegadas;
	
	public Televisao(String fabricante, double preco, int polegadas){
		super(fabricante, preco);
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	

	
	
	@Override
	public String toString(){
		String texto;
		texto = "Fabricante "+this.getFabricante()+"\n";
		texto += "Preco "+this.calculaPrecoFinal()+"\n";
		texto += "Polegada "+this.getPolegadas()+"\n";
		return texto;
	}
	
	
	
}

