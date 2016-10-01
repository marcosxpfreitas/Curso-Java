package Carro;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int velocidade;
	
	public Carro(String marca, String modelo, String cor, int anoFabricacao, int velocidade){
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
		this.anoFabricacao=anoFabricacao;
		this.velocidade=velocidade;
		
	}
	public void acelerar(int aceleracao){
		velocidade = velocidade+aceleracao;
	}
	public boolean freiar(int desaceleracao){
		if(velocidade < desaceleracao){
			return false;
		}else{
			velocidade = velocidade-desaceleracao;
			return true;
		}
	}
	public int getVelocidade(){
		return velocidade;
	}
	
}
