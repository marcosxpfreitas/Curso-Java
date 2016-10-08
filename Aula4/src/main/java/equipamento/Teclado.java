package equipamento;

public class Teclado extends Equipamento{
	private String layout;

	
	public Teclado(String fabricante, double preco, String layout){
		super(fabricante,preco);
		this.layout=layout;
	}
	
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public String teclar(String layout){
		this.layout = layout;
		return this.layout;
	}
	
	public String toString(){
		String texto;
		texto = "Fabricante "+this.getFabricante()+"\n";
		texto += "Preco "+this.getPreco()+"\n";
		texto += "Layout "+this.getLayout()+"\n";
		return texto;
	}
	
	
}
