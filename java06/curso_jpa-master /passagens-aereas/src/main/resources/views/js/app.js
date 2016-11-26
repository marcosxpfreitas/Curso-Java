
/**
 * Controler da aplicacao. Possui funcoes para trocar o conteudo da pagina, mostrar mensagens...
 */
var app = (function($) {
	
	var TEMPLATE_MENU='parts/menu.html', 
		content = $("#content"), 
		menuContainer = $('#menu');
	
	var app = {};
	
	/**
	 * Altera o conteudo da pagina com base em um template
	 */
	app.openContent = function(opt) {
		var promise = $.get(opt.template + "?t=" + new Date().getTime());
		
		promise.then(function(responseText) {
			var container = opt.container || content;
			var template = doT.template(responseText);
			container.html(template(opt.data));
		});
		return promise;
	}
	
	/**
	 * Abre o template menu do sistema
	 */
	app.openMenu = function() {
		var promise = $.get(TEMPLATE_MENU);
		promise.then(function(responseText) {
			menuContainer.html(responseText);
		});
		return promise;
	}
	
	/**
	 * Objeto que lida com as mensagens do sistema
	 */
	app.messages = {};
	
	/**
	 * Mostrar as mensagens de erro
	 */
	app.messages.error = function(erros) {
		var messagesContainer = $('.messages');
		messagesContainer.html('');
		
		if(erros.length > 0) {
			erros.forEach(function(erro) {
				var messageDiv = $('<div class="alert alert-danger" role="alert"></div>');
				messageDiv.html(erro);
				messagesContainer.append(messageDiv);
			});
		}
	}
	
	/**
	 * Mostra as mensagens de sucesso
	 */
	app.messages.success = function(messages) {
		var messagesContainer = $('.messages');
		messagesContainer.html('');
		
		if(messages.length > 0) {
			messages.forEach(function(message) {
				var messageDiv = $('<div class="alert alert-success" role="alert"></div>');
				messageDiv.html(message);
				messagesContainer.append(messageDiv);
			});
		}
	}
	
	/**
	 * Limpa as mensagens visiveis
	 */
	app.messages.clear = function() {
		var messagesContainer = $('.messages');
		messagesContainer.html('');
	}
	
	/** 
	 * Controle os dialogs do sistema
	 */
	app.modal = {};
	app.modal.open = function(opt) {
		var modal = $('.modal');
		modal.find('.modal-title').html(opt.title);
		modal.find('.modal-body p').html(opt.content);
		modal.modal('show');
	}
	
	app.modal.close = function() {
		var modal = $('.modal');
		modal.modal('hide');
	}
	
	return app;
	
})(jQuery);