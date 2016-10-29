package aula5.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestarListar {

	public static void main(String[] args) {
		List minhaLista = new ArrayList();
		List minhaOutraLista = new LinkedList();

		minhaLista.add("Teste");
		minhaLista.add("Outra coisa");
		minhaLista.add(1);

		System.out.println("minhaLista: ");
		for (Object object : minhaLista) {
			System.out.println(object);
		}

		List<String> minhaListaString = new LinkedList<>();
		minhaListaString.add("Valor 1");
		minhaListaString.add("Valor 2");
		minhaListaString.add("Valor 3");
		minhaListaString.add("Valor 4");
		minhaListaString.add("Valor 4");
		minhaListaString.add(0, "Valor na posicao 0");
		minhaListaString.add(3, "Valor na posicao 3");

		int indexOf = minhaListaString.indexOf("Valor 3");
		System.out.println("Valor 3 esta na posicao: " + indexOf);

		System.out.println("minhaListaString: ");
		for (String valor : minhaListaString) {
			System.out.println(valor);
		}

		List<Integer> inteiros = new ArrayList<>();
		List<Double> doubles = new ArrayList<>();
		
		inteiros.add(10);
	}
}
