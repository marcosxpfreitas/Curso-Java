package aula2.pessoa;

import java.util.Scanner;

/**
 * Vamos fazer um exemplo simples: Crie uma classe Pessoa e crie os atributos
 * nome, cpf, rg. Cria uma classe TestarPessoa (sua classe executável) que faça
 * a leitura dos dados da pessoa do teclado, e instancie o objeto pessoa
 * passando os dados lidos no construtor. Imprima os dados usando o seguinte:
 * System.out.println(nomeDaVarivel); <br>
 * 
 * O que aconteceu? <br>
 * 
 * Foi impresso o valor padrão do toString da classe Object (todo objeto no Java
 * é um java.lang.Object, portanto, toda classe herda as características de
 * java.lang.Object). <br>
 * 
 * Para customizar isso temos que sobrescrever o método toString na classe
 * Pessoa.
 * 
 * @author diego
 *
 */
public class TestarPessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scanner.nextLine();

		System.out.println("CPF: ");
		String cpf = scanner.nextLine();

		System.out.println("RG: ");
		String rg = scanner.nextLine();

		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		System.out.println(pessoa);

		scanner.close();
	}
}
