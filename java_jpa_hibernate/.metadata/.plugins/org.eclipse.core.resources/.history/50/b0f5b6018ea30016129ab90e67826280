package com.dextraining.garagem.view;

import java.io.IOException;
import java.util.Scanner;

import com.dextraining.garagem.dominio.Garagem;
import com.dextraining.garagem.dominio.GaragemJPA;
import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class InterfaceUsuario {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Garagem garagem = new GaragemJPA();

		int opcao = menu(scanner);
		while (opcao != 5) {
			if (opcao == 1) {
				adicionarVeiculo(scanner, garagem);
			} else if (opcao == 2) {
				venderVeiculo(scanner, garagem);
			} else if (opcao == 3) {
				buscarVeiculo(scanner, garagem);
			} else if (opcao == 4) {
				listarVeiculos(garagem);
			} else {
			}
			opcao = menu(scanner);
		}
		scanner.close();
	}

	private static void listarVeiculos(Garagem garagem) {
		System.out.println("Veiculos encontrados: ");
		for (Veiculo veiculo : garagem.listar()) {
			System.out.println(veiculo);
		}
	}

	private static void buscarVeiculo(Scanner scanner, Garagem garagem) {
		System.out.println("Placa: ");
		String placa = scanner.nextLine();

		Veiculo veiculo = garagem.buscar(placa);
		if (veiculo != null) {
			System.out.println(veiculo);
		} else {
			System.out.println("Veiculo nao encontrado!");
		}
	}

	private static void venderVeiculo(Scanner scanner, Garagem garagem) {
		System.out.println("Placa: ");
		String placa = scanner.nextLine();

		try {
			garagem.vender(placa);
		} catch (VeiculoNaoEncontradoException e) {
			System.out.println("Placa nao encontrada!");
		}
	}

	private static void adicionarVeiculo(Scanner scanner, Garagem garagem) {
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

		try {
			garagem.adicionar(veiculo);
		} catch (VeiculoDuplicadoException e) {
			System.out.println("Placa duplicada. Veiculo nao adicionado!");
		}
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
