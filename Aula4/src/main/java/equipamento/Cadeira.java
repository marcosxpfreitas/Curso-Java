package equipamento;

public class Cadeira extends Equipamento {
	private String cor;
	
	
	public Cadeira(String fabricante, double preco, String cor){
		super(fabricante,preco);
		this.cor = cor;
		
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	@Override
	public double calculaPrecoFinal(){
		if(this.cor.equals("marrom")){
			this.setPreco(180);
			return getPreco();
		}else{
			this.setPreco(250);
			return getPreco();
		}
	}
	
	public String toString(){
		String texto;
		texto = "Fabricante "+this.getFabricante()+"\n";
		texto += "Preco "+this.calculaPrecoFinal()+"\n";
		texto += "Cor "+this.getCor()+"\n";
		return texto;
	}
	
	
	
	
	
}
