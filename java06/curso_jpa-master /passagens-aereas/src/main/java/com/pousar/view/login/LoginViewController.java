package com.pousar.view.login;

import com.pousar.app.util.JsonUtil;
import com.pousar.domain.usuario.Usuario;
import com.pousar.domain.usuario.UsuarioService;

public class LoginViewController {

	private static Usuario usuarioLogado;

	public boolean logar(String email, String senha) {
		Usuario usuario = new UsuarioService().buscarParaLogin(email, senha);
		if (usuario == null) {
			return false;
		}
		LoginViewController.usuarioLogado = usuario;
		return true;
	}

	public String getUsuarioLogado() {
		if (usuarioLogado != null) {
			return JsonUtil.toJson(usuarioLogado);
		}
		return null;
	}

	public static Long getUsuarioLogadoId() {
		if (usuarioLogado == null) {
			return null;
		}
		return usuarioLogado.getId();
	}
}