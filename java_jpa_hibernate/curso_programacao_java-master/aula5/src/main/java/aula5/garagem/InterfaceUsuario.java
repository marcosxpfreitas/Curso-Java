package aula5.garagem;

import java.io.IOException;
import java.util.Scanner;

public class InterfaceUsuario {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Garagem garagem = new GaragemComMapa();
		
		int opcao = menu(scanner);
		while (opcao != 5) {
			if (opcao == 1) {
				System.out.println("Marca: ");
				String marca = scanner.nextLine();
				System.out.println("Modelo: ");
				String modelo = scanner.nextLine();
				System.out.println("Placa: ");
				String placa = scanner.nextLine();
				System.out.println("Ano: ");
				int ano = scanner.nextInt();
				System.out.println("Preco: ");
				double preco = scanner.nextDouble();

				Veiculo veiculo = new Veiculo(marca, modelo, placa, ano, preco);
				boolean inseriu = garagem.adicionar(veiculo);
				if (!inseriu) {
					System.out.println("Placa duplicada. Veiculo nao adicionado!");
				}
			} else if (opcao == 2) {
				System.out.println("Placa: ");
				String placa = scanner.nextLine();

				boolean vendeu = garagem.vender(placa);
				if (!vendeu) {
					System.out.println("Placa nao encontrada!");
				}
			} else if (opcao == 3) {
				System.out.println("Placa: ");
				String placa = scanner.nextLine();

				Veiculo veiculo = garagem.buscar(placa);
				if (veiculo != null) {
					System.out.println(veiculo);
				} else {
					System.out.println("Veiculo nao encontrado!");
				}
			} else if (opcao == 4) {
				System.out.println("Veiculos encontrados: ");
				for (Veiculo veiculo : garagem.listar()) {
					System.out.println(veiculo);
				}
			} else {
			}
			opcao = menu(scanner);
		}
		scanner.close();
	}
	
	private static int menu(Scanner scanner) throws IOException {
		System.out.println("1. Adicionar");
		System.out.println("2. Vender (por placa)");
		System.out.println("3. Buscar (por placa)");
		System.out.println("4. Listar");
		System.out.println("5. Sair");
		
		int opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}
}
