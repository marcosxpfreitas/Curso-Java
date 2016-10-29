package aula5.pedagio;

public class TestarPedagio {

	public static void main(String[] args) {
		PagaPedagio caminhao = new Caminhao(8);
		PagaPedagio carro = new Carro();
		PagaPedagio moto = new Moto();
		Veiculo bicicleta = null;
		
		PagaPedagio algo = (PagaPedagio) bicicleta;

		CalculadorPedagio calculador = new CalculadorPedagio(2);
		System.out.println("Caminhao: " + calculador.calcular(caminhao));
		System.out.println("Carro: " + calculador.calcular(carro));
		System.out.println("Moto: " + calculador.calcular(moto));
		// System.out.println("Bicicleta: " + calculador.calcular(bicicleta));
		// calculador.calcular(bicicleta);
	}
}
