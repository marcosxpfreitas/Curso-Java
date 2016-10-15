package pedagio;

public abstract class Veiculo {
	private String modelo;
	private String cor;
	private int eixos;
	
	public Veiculo(String modelo, String cor, int eixos){
		this.modelo=modelo;
		this.cor=cor;
		this.eixos=eixos;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	
	
	
}
