package exemplos;

public class ExemploVariaveis {
	/**
	 * Variaveis globais são iniciadas com o valor padrão. 0 - Para tipos
	 * numericos '' - Para char null - Para objecto
	 */
	static int x;
	static boolean mentira;
	static char meuChar;
	static String minhaString;

	public static void main(String[] args) {
		fazAlgo();

		System.out.println(x);
		System.out.println(mentira);
		System.out.println(meuChar);
		System.out.println(minhaString);

		/**
		 * O trecho comentado resulta em NullPointerException por que
		 * minhaString foi inicializado com null, ou seja, nao "aponta" para
		 * nenhum objeto valido (existente na memoria).
		 */
		// System.out.println(minhaString.equals("algo"));

	}

	public static void fazAlgo() {
		/**
		 * Variaveis locais precisam ser inicializadas. Caso contrário o código
		 * não compila. Experimente remover as atribuicoes "= 0" das duas linhas
		 * abaixo e veja o que acotece.
		 */
		int minhaVar = 0;
		int minhaOutraVar = 0;

		System.out.println("minhaVar: " + minhaVar);
		System.out.println("minhaOutraVar: " + minhaOutraVar);
	}
}
