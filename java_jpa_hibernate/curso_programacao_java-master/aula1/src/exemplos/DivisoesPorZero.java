package exemplos;

public class DivisoesPorZero {

	public static void main(String[] args) {
		// Divir algum por double ou float zero retorna +Infinito ou -Infinito
		System.out.println(-10 / 0.0);
		// Dividir por 0 inteiro eh matematicamente invalido, por isso resulta
		// em erro.
		System.out.println(-10 / 0);
	}
}
