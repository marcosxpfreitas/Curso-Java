package aula3.biblioteca;

public class Biblioteca {
	private static final int MAX_LIVROS = 100;
	private Livro[] livros;
	private int quantidadeLivros;

	public Biblioteca() {
		this.livros = new Livro[MAX_LIVROS];
		this.quantidadeLivros = 0;
	}

	public void adicionar(Livro livro) {
		System.out.println("adicionar");
	}

	public Livro buscar(String codigo) {
		System.out.println("buscar");
		return null;
	}

	public void listar() {
		for (int i = 0; i < quantidadeLivros; i++) {
			System.out.println(livros[i]);
		}
	}
}
