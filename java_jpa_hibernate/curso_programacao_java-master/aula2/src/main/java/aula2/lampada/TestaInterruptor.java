package aula2.lampada;

/**
 * 
 * Crie uma classe Lampada com os seguintes atributos: Número de watts,
 * Fabricante. Além disso, crie métodos para ligar e desligar a lâmpada (Apenas
 * imprima “Ligada” e “Desligada”). Crie uma classe chamada Interruptor. Essa
 * classe deve receber uma lâmpada em seu construtor e possuir o método public
 * void apertar(). Esse método deve alternar o status da lâmpada acionada pelo
 * interruptor: <br>
 * 
 * Se ela estiver ligada, desligar;<br>
 * Se ela estiver desligada, ligar.<br>
 * 
 * Crie uma classe executável e teste seu código criando um Interruptor uma
 * lâmpada e executando as operações.
 * 
 * @author diego
 *
 */
public class TestaInterruptor {

	public static void main(String[] args) {
		Lampada lampada = new Lampada("60", "Philips");
		Interruptor interruptor = new Interruptor(lampada);

		// "Aperta" o interruptor varias vezes para verificar se está alternando
		// o status da lampada.
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
	}
}
