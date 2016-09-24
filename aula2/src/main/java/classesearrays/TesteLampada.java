package classesearrays;

public class TesteLampada {
	public static void main(String args[]){
		Lampada l = new Lampada();
		
		Interruptor i = new Interruptor(l);
		i.apertar();
		i.apertar();
		i.apertar();
		i.apertar();
		i.apertar();
		i.apertar();
		i.apertar();
		
	}
	
	

}
