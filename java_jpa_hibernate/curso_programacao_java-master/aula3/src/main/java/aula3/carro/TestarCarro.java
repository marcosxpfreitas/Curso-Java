package aula3.carro;

public class TestarCarro {

	public static void main(String[] args) {
		Carro primeiroCarro = new Carro("Ferrari", "430 Scuderia", "Vermelha", 2009);
		Carro segundo = new Carro("Fiat", "Uno", "Branco", 2009);
		primeiroCarro.acelerar();
		primeiroCarro.acelerar();
		primeiroCarro.frear();
		primeiroCarro.acelerar();

		segundo.acelerar();
		segundo.acelerar();
		segundo.acelerar();
		segundo.frear();
		segundo.frear();

		System.out.println(primeiroCarro.getVelocidade());
		System.out.println(segundo.getVelocidade());
	}
}
