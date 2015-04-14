package li.barlog

import groovy.transform.CompileStatic

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

@CompileStatic
class App extends Application {
	static def main(String... args) {
		launch(App.class, args)
	}

	@Override
	void start(Stage stage) throws Exception {
		final URL location = getClass().getResource('/stage/main.fxml')
		final FXMLLoader fxmlLoader = new FXMLLoader(location)
		final Pane pane = (Pane) fxmlLoader.load()

		def scene = new Scene(pane);
		stage.setScene(scene);
		stage.setMinWidth(pane.getPrefWidth() + 16);
		stage.setMinHeight(pane.getPrefHeight() + 24);
		stage.show();
	}
}
