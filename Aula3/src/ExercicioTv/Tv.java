package ExercicioTv;

public class Tv {
	private String marca;
	private String modelo;
	private String Tela = "desligada";
	private int voltagem;
	private int volume=0;
	private int canal;
	private char status='0';
	
	public Tv(String marca, String modelo,int voltagem){
		this.marca=marca;
		this.modelo=modelo;
		this.alterarVoltagem(voltagem);
		
	}
	public boolean ligar (){
		if(status=='0'){
			this.status='1';
			this.Tela="Ligada";
			return true;
			
		}else
			return false;
	}
	
	public boolean desligar(){
		if(status=='1'){
			this.status='0';
			this.Tela ="Desligada";
			return true;
		}else
			return false;
	
	}
	
	public int aumentarVolume(int volume){
		if (this.volume<30){
			this.volume+=volume;
			return this.volume;
		}else{
			return this.volume;
		}
		
	}
	
	public int diminuirVolume(int volume){
		if(this.volume>0){
			this.volume-=volume;
			return this.volume;
		}else
			return this.volume;
	}
	
	public void aumentarCanal(){
		this.canal++;
	}
	
	public void diminuirCanal(){
		this.canal--;
	}
	
	private void alterarVoltagem(int voltagem){
		if((voltagem == 110)|(voltagem == 220)){ 
			this.voltagem=voltagem;
		}
	}
	
	public int getVoltagem(){
		return this.voltagem;
	}
	
	
	
}
	

