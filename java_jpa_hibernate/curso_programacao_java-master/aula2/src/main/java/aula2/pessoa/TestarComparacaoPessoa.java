package aula2.pessoa;

import java.util.Scanner;

public class TestarComparacaoPessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scanner.nextLine();

		System.out.println("CPF: ");
		String cpf = scanner.nextLine();

		System.out.println("RG: ");
		String rg = scanner.nextLine();

		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		Pessoa mesmaPessoa = pessoa;
		Pessoa outraPessoa = new Pessoa(nome, cpf, rg);

		/**
		 * Comparacoes com "==" verificam se os ponteiros apontam para o mesmo
		 * objeto.
		 */
		// Retorna true por que apontam para mesmo lugar
		System.out.println("(pessoa == mesmaPessoa) = " + (pessoa == mesmaPessoa));
		// Retorna false por que apontam para lugares diferentes (mesmo tendo
		// mesmo conteudo)
		System.out.println("(pessoa == outraPessoa) = " + (pessoa == outraPessoa));

		/**
		 * Ambos retornam true por que o .equals, quando sobrescrito, compara o
		 * conteudo do objeto (a implementacao padrão retorna o mesmo resultado
		 * da comparacao com "==")
		 */
		System.out.println("pessoa.equals(mesmaPessoa) = " + pessoa.equals(mesmaPessoa));
		System.out.println("pessoa.equals(outraPessoa) = " + pessoa.equals(outraPessoa));

		scanner.close();
	}
}
