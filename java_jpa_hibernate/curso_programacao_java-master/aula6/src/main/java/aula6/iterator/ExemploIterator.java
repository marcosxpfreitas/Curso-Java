package aula6.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("valor 1");
		lista.add("valor 2");
		lista.add("valor 3");
		lista.add("valor 4");
		lista.add("valor 5");

		/*
		 * Erro de concorrencia ao tentar remover da lista dentro de um for
		 */
		// for (String valor : lista) {
		// if (valor.equals("valor 3")) {
		// lista.remove(valor);
		// }
		// }

		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			String valor = iterator.next();

			if (valor.equals("valor 3")) {
				iterator.remove();
			}
		}

		System.out.println("Elementos: ");
		for (String string : lista) {
			System.out.println(string);
		}
	}
}
