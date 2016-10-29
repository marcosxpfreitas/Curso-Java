package aula6.generics;

public class ExemploGenerics {

	public static void main(String[] args) {
		Wrapper<String> wrapperString = new Wrapper<>("Meu valor");
		Wrapper<Integer> wrapperInteger = new Wrapper<Integer>(1);

		// Wrapper wrapperObject = new Wrapper<>("string");

		System.out.println(wrapperString.getValor().getClass());
		System.out.println(wrapperInteger.getValor().getClass());
	}
}
