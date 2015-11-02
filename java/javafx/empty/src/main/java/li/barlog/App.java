package li.barlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.application.Application;

public final class App extends Application {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String... args) {
		launch(App.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(App.class.
			getResource("/stage/main.fxml"));
		Pane pane = (Pane) loader.load();

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setMinWidth(pane.getPrefWidth());
		stage.setMinHeight(pane.getPrefHeight());
		stage.show();
	}
}
