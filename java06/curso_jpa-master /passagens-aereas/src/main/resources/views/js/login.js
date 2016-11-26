
/**
 * Controller da tela de login do sistema
 */
(function($) {
	
	app.login = {};
	
	/**
	 * Abre a tela de login.
	 */
	app.login.open = function() {
		app.openContent({
			template: 'parts/login.html'
		});
	}
	
	/**
	 * Realiza o login e rediciona para a home.
	 * Mostra mensagem de erro caso nao consiga realizar o login
	 */
	app.login.logar = function() {
		var dadosLogin = $('.login form').serializeJSON();
		var sucesso = loginController.logar(dadosLogin.email, dadosLogin.senha);
		if(sucesso) {
			app.home.open();
		} else {
			$('.login .error')
				.html("Email/senha inv\u00E1lidos. Verifique seus dados e tente novamente!")
				.addClass('open');
		}
	}
})(jQuery);