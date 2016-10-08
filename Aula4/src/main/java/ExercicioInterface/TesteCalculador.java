package ExercicioInterface;

public class TesteCalculador {
	public static void main(String args[]){
		Circulo circulo1 = new Circulo(5.0);
		Quadrado quadrado1 = new Quadrado(4);
		Retangulo retangulo1 = new Retangulo(2,5);
		
		
		CalculadorArea x = new CalculadorArea();
		System.out.println(x.calcular(circulo1));
		System.out.println(x.calcular(quadrado1));
		System.out.println(x.calcular(retangulo1));
	}
}
