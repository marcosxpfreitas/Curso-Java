package equipamento;

public class Impressora extends Eletronico{
	private int portonsPorPolegadas;

	
	public Impressora(String fabricante, double preco,int pontosPorPolegadas){
		super(fabricante,preco);
		this.portonsPorPolegadas = pontosPorPolegadas;
		
		
	}
	
	public int getPortonsPorPolegadas() {
		return portonsPorPolegadas;
	}

	public void setPortonsPorPolegadas(int portonsPorPolegadas) {
		this.portonsPorPolegadas = portonsPorPolegadas;
	}
	
	public void imprimir(String valor,String variavel){
		System.out.println(" "+valor+ " "+variavel);
	}
	
		
	public String toString(){
		String texto;
		texto = "Fabricante "+this.getFabricante()+"\n";
		texto += "Preco "+this.getPreco()+"\n";
		texto += "Pontos por Poelegada "+this.getPortonsPorPolegadas()+"\n";
		return texto;
	}
	
	
	

}
