package classesearrays;

public class Pessoa {
	private String nome;
	private String CPF;
	private String rg;
	
	public Pessoa (String nome, String CPF, String rg){
		this.nome = nome;
		this.CPF = CPF;
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		String texto;
		texto ="Nome: " +this.nome+" ";
		texto +="CPF: "+this.CPF+" ";
		texto +="RG: "+this.rg+" ";
		return texto;
	}

}
