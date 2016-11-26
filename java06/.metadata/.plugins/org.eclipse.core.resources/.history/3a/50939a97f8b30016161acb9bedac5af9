package com.pousar.domain.usuario;

import java.util.ArrayList;
import java.util.List;

import com.pousar.domain.ValidacaoException;
import com.pousar.jpa.BaseService;

public class UsuarioService extends BaseService<Usuario> {

	public UsuarioService() {
		super(Usuario.class);
	}

	@Override
	public Usuario salvar(Usuario entidade) {
		// TODO: Implementar validacoes e salvar usuario no banco de dados.
		throw new ValidacaoException("Ainda nao implementado");
	}

	public Usuario buscarParaLogin(String email, String senha) {
		// TODO: implementar login buscando dados no banco de dados

		if ("admin@pousar.com".equals(email) && "123".equals(senha)) {
			Usuario usuario = new Usuario();
			usuario.setEmail("admin@pousar.com");
			usuario.setNome("Administrador");
			usuario.setSenha("123");

			return usuario;
		}
		return null;
	}

	public Usuario buscarPorEmail(String email) {
		// TODO: Buscar usuario por email
		return null;
	}

	public List<Usuario> buscarPor(String email, String nome) {
		// TODO: Buscar usuario por email ou nome
		return new ArrayList<>();
	}
}
