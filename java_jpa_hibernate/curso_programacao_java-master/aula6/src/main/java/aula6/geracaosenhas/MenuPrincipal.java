package aula6.geracaosenhas;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GeradorSenha geradorSenha = new GeradorSenha();
		int opcao = menu(scanner);
		while (opcao != 4) {
			if (opcao == 1) {
				String senha = geradorSenha.gerarSenhaIdoso();
				System.out.println(senha);
			} else if (opcao == 2) {
				String senha = geradorSenha.gerarSenhaPadrao();
				System.out.println(senha);
			} else if (opcao == 3) {
				String senha = geradorSenha.proximaSenha();

				if (senha == null) {
					System.out.println("Nenhuma senha para atendimento!");
				} else {
					System.out.println(senha);
				}
			} else {
				System.out.println("Invalido!");
			}
			opcao = menu(scanner);
		}
		scanner.close();
	}

	private static int menu(Scanner scanner) {
		System.out.println("1. Gerar senha idoso");
		System.out.println("2. Gerar senha padrão");
		System.out.println("3. Proxima senha");
		System.out.println("4. Sair");
		int opcao = scanner.nextInt();
		return opcao;
	}
}
