package aula4.animal;

public class Jacare extends Reptil implements Examinavel {

	public void examinar() {
		emitirSom();
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do jacare");
	}
}
