package classesearrays;

public class Interruptor {
	
	Lampada lampada1;
	
	
	public Interruptor (Lampada lampada1) {
		this.lampada1 = lampada1;
	}
	public void apertar(){
		Lampada lampada1 = new Lampada();
		if (lampada1.estaLigada()==false){
			lampada1.ligada();
			
		}else 
		{
			lampada1.desligada();
			
		}
	}
	

}
