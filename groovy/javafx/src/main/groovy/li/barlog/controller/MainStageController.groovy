package li.barlog.controller

import groovy.transform.CompileStatic

import javafx.fxml.FXML
import javafx.application.Platform
import javafx.event.ActionEvent

@CompileStatic
class MainStageController {
	@FXML
	private void initialize() {
	}

	void onCloseMenuItemAction(ActionEvent action) {
		Platform.exit()
	}
}
