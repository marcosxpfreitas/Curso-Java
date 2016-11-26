package com.pousar.app;

import java.io.File;

import com.pousar.jpa.EntityManagerUtil;
import com.pousar.view.login.LoginViewController;
import com.pousar.view.usuario.UsuarioViewController;
import com.pousar.view.viagem.ViagemViewController;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class AppStarter extends Application {

	private static final String RESOURCES_LOCATION = "views/";
	private static final String INDEX_TEMPLATE = "views/index.html";

	@Override
	public void start(Stage primaryStage) {
		WebView browser = configurarBrowser();

		Scene scene = new Scene(browser, 800, 600);
		primaryStage.setTitle("Pousar - Passagens aereas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private WebView configurarBrowser() {
		WebView browser = new WebView();
		final WebEngine webEngine = browser.getEngine();
		webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
			@Override
			public void changed(ObservableValue<? extends State> observable, State oldValue, State newValue) {
				JSObject jsobj = (JSObject) webEngine.executeScript("window");
				jsobj.setMember("loginController", new LoginViewController());
				jsobj.setMember("usuarioController", new UsuarioViewController());
				jsobj.setMember("viagemController", new ViagemViewController());
			}
		});
		webEngine.load(getLocation(INDEX_TEMPLATE));
		webEngine.setUserDataDirectory(new File(getLocation(RESOURCES_LOCATION)));
		return browser;
	}

	private String getLocation(String resource) {
		return AppStarter.class.getClassLoader().getResource(resource).toString();
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		EntityManagerUtil.fechar();
	}

	public static void main(String[] args) {
		EntityManagerUtil.init();
		launch(args);
	}
}
