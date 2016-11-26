package com.pousar.app.tools;

import java.util.Scanner;

import com.pousar.domain.usuario.Usuario;
import com.pousar.domain.usuario.UsuarioService;

public class GeradorUsuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Usuario usuario = new Usuario();

		System.out.println("Email: ");
		usuario.setEmail(scanner.nextLine());

		System.out.println("Nome: ");
		usuario.setNome(scanner.nextLine());

		System.out.println("Senha: ");
		usuario.setSenha(scanner.nextLine());

		new UsuarioService().salvar(usuario);

		System.out.println("Usuario cadastrado com sucesso!");

		scanner.close();
	}
}
