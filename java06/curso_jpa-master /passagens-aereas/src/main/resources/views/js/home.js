(function($) {
	
	var TEMPLATE_HOME = 'parts/home.html';
	
	app.home = {};
	app.home.open = function() {
		app.openContent( {
			template: TEMPLATE_HOME
		});
		app.openMenu();
	}

})(jQuery);