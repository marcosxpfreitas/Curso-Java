package aula4.animal;

public class Baleia extends Mamifero implements Examinavel {

	public void examinar() {
		emitirSom();
	}

	@Override
	public void emitirSom() {
		System.out.println("Som da baleira");
	}
}
