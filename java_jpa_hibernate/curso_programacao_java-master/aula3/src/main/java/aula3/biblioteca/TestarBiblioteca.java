package aula3.biblioteca;

import java.util.Scanner;

public class TestarBiblioteca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Biblioteca biblioteca = new Biblioteca();
		int opcao = menu(scanner);
		while (opcao != 4) {

			if (opcao == 1) {
				// TODO: Ler os dados do livro, instanciar um objeto livro com
				// os valores e chamar o metodo adicionar da biblioteca
				biblioteca.adicionar(null);
			} else if (opcao == 2) {
				// TODO: Ler o codigo e chamar o metodo buscar da biblioteca
				biblioteca.buscar(null);
			} else if (opcao == 3) {
				// TODO: Listar livros do array
				biblioteca.listar();

			} else {
				System.out.println("Opção inválida!");
			}
			opcao = menu(scanner);
		}
	}

	private static int menu(Scanner scanner) {
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Buscar Livro");
		System.out.println("3. Listar livros");
		System.out.println("4. Sair");
		int opcao = scanner.nextInt();
		return opcao;
	}
}
