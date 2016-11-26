(function($) {

	var TEMPLATE_LISTAR = 'parts/usuario/listar.html', 
		TEMPLATE_GRID = 'parts/usuario/grid.html', 
		TEMPLATE_CADASTRAR = 'parts/usuario/cadastrar.html';

	var FORM_SELECTOR = '.usuario form',
		GRID_CONTAINER_SELECTOR = '#grid-container';
	
	app.usuarios = {};
	app.usuarios.listar = function() {
		app.openContent({
			template : TEMPLATE_LISTAR
		}).then(function() {
			app.usuarios.buscar();
		})
	}

	app.usuarios.editar = function(id) {
		var usuarioJSON = usuarioController.buscarPorId(id);
		var usuario = JSON.parse(usuarioJSON);

		app.openContent({
			template : TEMPLATE_CADASTRAR,
			data : {
				usuario : usuario
			}
		});
	}

	app.usuarios.remover = function(id) {
		$(FORM_SELECTOR).data('id', id);
		
		app.modal.open({
			title: 'Confirmacao de remocao',
			content: 'Deseja realmente remover o usuario?'
		});
		
	}
	
	app.usuarios.confirmarRemocao = function() {
		app.modal.close();
		
		var id = $(FORM_SELECTOR).data('id');
		var resultadoJSON = usuarioController.remover(id);
		var resultado = JSON.parse(resultadoJSON);

		if (resultado.status == 'SUCESSO') {
			app.messages.success([ "Usuario removido com sucesso!" ]);
			app.usuarios.listar();
		} else {
			app.messages.error(resultado.erros);
		}
	}
	
	app.usuarios.buscar = function() {
		var filtro = $(FORM_SELECTOR).serializeJSON();
		var usuariosJSON = usuarioController.buscar(filtro.email, filtro.nome);
		var usuarios = JSON.parse(usuariosJSON);

		app.openContent({
			container : $(GRID_CONTAINER_SELECTOR),
			template : TEMPLATE_GRID,
			data : {
				usuarios : usuarios
			}
		});
	}

	app.usuarios.salvar = function() {
		var usuario = $(FORM_SELECTOR).serializeJSON();
		var erros = validarCadastro(usuario);

		if (erros.length > 0) {
			app.messages.error(erros);
			return;
		}
		var usuarioJSON = JSON.stringify(usuario);
		var resultadoJSON = usuarioController.salvar(usuarioJSON);
		var resultado = JSON.parse(resultadoJSON);

		if (resultado.status == 'SUCESSO') {
			app.messages.success([ "Usuario cadastrado com sucesso!" ]);
			app.usuarios.listar();
		} else {
			app.messages.error(resultado.erros);
		}
	}

	app.usuarios.cadastrar = function() {
		app.openContent({
			template : TEMPLATE_CADASTRAR,
			data : {
				usuario : { email : '', nome : '', senha : '', confirmacaoSenha : '' }
			}
		});
	}

	function validarCadastro(usuario) {
		var erros = [];

		if (!usuario.email) {
			erros.push("O campo email eh obrigatorio");
		}
		if (!usuario.nome) {
			erros.push("O campo nome eh obrigatorio");
		}
		if (!usuario.senha) {
			erros.push("O campo senha eh obrigatorio");
		}
		if (!usuario.confirmacaoSenha) {
			erros.push("O campo confirmacao de senha eh obrigatorio");
		}
		if (usuario.senha != usuario.confirmacaoSenha) {
			erros.push("A senha e a confirmacao estao diferentes");
		}
		return erros;
	}

})(jQuery);