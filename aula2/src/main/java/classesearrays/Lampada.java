package classesearrays;

public class Lampada {
	double watts;
	String fabricante;
	boolean ligada;
	
	public void ligada (){
		System.out.println("Ligada");
		this.ligada=true;
	}
	public void desligada (){
		System.out.println("Desligada");
		this.ligada=false;
	}
	public boolean estaLigada(){
		return ligada;
	}

}
