(function($) {

	var TEMPLATE_LISTAR = 'parts/viagem/listar.html', 
		TEMPLATE_GRID = 'parts/viagem/grid.html', 
		TEMPLATE_CADASTRAR = 'parts/viagem/cadastrar.html';

	var FORM_SELECTOR = '.viagem form',
		GRID_CONTAINER_SELECTOR = '#grid-container';
	
	var DATE_FORMAT = '00/00/0000',
		DATE_FORMAT_PLACEHOLDER = '__/__/____',
		DATE_TIME_FORMAT = '00/00/0000 00:00',
		DATE_TIME_FORMAT_PLACEHOLDER = '__/__/____ __:__';
	
	app.viagem = {};
	app.viagem.listar = function() {
		app.openContent({
			template : TEMPLATE_LISTAR
		}).then(function() {
			$('.date').mask(DATE_FORMAT, {
				placeholder: DATE_FORMAT_PLACEHOLDER
			});
			app.viagem.buscar();
		})
	}

	app.viagem.editar = function(id) {
		var viagemJSON = viagemController.buscarPorId(id);
		var viagem = JSON.parse(viagemJSON);

		app.openContent({
			template : TEMPLATE_CADASTRAR,
			data : {
				viagem : viagem
			}
		});
	}

	app.viagem.buscar = function() {
		var filtro = $(FORM_SELECTOR).serializeJSON();
		var viagensJSON = viagemController.buscar(filtro.origem, filtro.destino, filtro.dataIda, filtro.dataVolta);
		var viagens = JSON.parse(viagensJSON);

		app.openContent({
			container : $(GRID_CONTAINER_SELECTOR),
			template : TEMPLATE_GRID,
			data : {
				viagens : viagens,
				dateFormatter: function(date) {
					return moment(date).format('DD/MM/YYYY');
				},
				timeFormatter: function(date) {
					return moment(date).format('hh:mm:ss');
				}
			}
		});
	}

	app.viagem.salvar = function() {
		var viagem = $(FORM_SELECTOR).serializeJSON();
		viagem.volta.origem = viagem.ida.destino;
		viagem.volta.destino = viagem.ida.origem;
		
		var erros = validarCadastro(viagem);

		if (erros.length > 0) {
			app.messages.error(erros);
			return;
		}
		var viagemJSON = JSON.stringify(viagem);
		var resultadoJSON = viagemController.salvar(viagemJSON);
		var resultado = JSON.parse(resultadoJSON);
		
		if (resultado.status == 'SUCESSO') {
			app.messages.success([ "viagem cadastrada com sucesso!" ]);
			app.viagem.listar();
		} else {
			app.messages.error(resultado.erros);
		}
	}

	app.viagem.cadastrar = function() {
		app.openContent({
			template : TEMPLATE_CADASTRAR,
			data : {
				viagem : { 
					ida: {origem: '', destino: '', dataHoraSaida: '', dataHoraChegada: ''},
					volta: {origem: '', destino: '', dataHoraSaida: '', dataHoraChegada: ''}
				}
			}
		}).then(function() {
			$('.datetime').mask(DATE_TIME_FORMAT, {
				placeholder: DATE_TIME_FORMAT_PLACEHOLDER
			});
		});
	}

	function validarCadastro(viagem) {
		var erros = [];

		if (!viagem.ida.origem) {
			erros.push("O campo origem eh obrigatorio");
		}
		if (!viagem.ida.destino) {
			erros.push("O campo destino eh obrigatorio");
		}
		if (!viagem.preco) {
			erros.push("O campo preco eh obrigatorio");
		}
		if (!viagem.ida.dataHoraSaida) {
			erros.push("O campo data/hora saida da ida eh obrigatorio");
		}
		if (!viagem.ida.dataHoraChegada) {
			erros.push("O campo data/hora chegada da ida eh obrigatorio");
		}
		if (!viagem.volta.dataHoraSaida) {
			erros.push("O campo data/hora saida da volta eh obrigatorio");
		}
		if (!viagem.volta.dataHoraChegada) {
			erros.push("O campo data/hora chegada da volta eh obrigatorio");
		}
		return erros;
	}

})(jQuery);