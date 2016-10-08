package ExercicioInterface;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	public double getArea() {
		return raio*raio*Math.PI; 
	}
	
	

}
