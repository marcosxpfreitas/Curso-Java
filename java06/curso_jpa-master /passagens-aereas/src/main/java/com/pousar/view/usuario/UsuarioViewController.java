package com.pousar.view.usuario;

import java.util.List;

import com.pousar.app.util.JsonUtil;
import com.pousar.domain.ValidacaoException;
import com.pousar.domain.usuario.Usuario;
import com.pousar.domain.usuario.UsuarioService;
import com.pousar.view.login.LoginViewController;
import com.pousar.view.operacao.ResultadoOperacaoErro;
import com.pousar.view.operacao.ResultadoOperacaoSucesso;

public class UsuarioViewController {

	private UsuarioService usuarioService = new UsuarioService();

	public String buscar(String email, String nome) {
		List<Usuario> usuarios = usuarioService.buscarPor(email, nome);
		return JsonUtil.toJson(usuarios);
	}
	
	public String salvar(String usuarioJson) {
		try {
			usuarioService.salvar(JsonUtil.fromJson(usuarioJson, Usuario.class));
			return JsonUtil.toJson(new ResultadoOperacaoSucesso());
		} catch (ValidacaoException e) {
			return JsonUtil.toJson(new ResultadoOperacaoErro(e.getMessage()));
		}
	}

	public String buscarPorId(String id) {
		return JsonUtil.toJson(usuarioService.buscarPorId(Long.valueOf(id)));
	}

	public String remover(String idString) {
		Long id = Long.valueOf(idString);
		
		if (id.equals(LoginViewController.getUsuarioLogadoId())) {
			return JsonUtil.toJson(new ResultadoOperacaoErro("O usuario logado nao pode ser removido"));
		}
		usuarioService.remover(id);
		return JsonUtil.toJson(new ResultadoOperacaoSucesso());
	}
}
