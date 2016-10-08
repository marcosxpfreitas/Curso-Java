package ExercicioInterface;

public class Retangulo implements AreaCalculavel{
	double largura,altura;
	
	public Retangulo(double largura, double altura){
		this.largura=largura;
		this.altura=largura;
	}

	public double getArea() {
		return largura*altura;
	}
	
	
}
