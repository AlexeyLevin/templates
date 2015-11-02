package li.barlog.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class MainStageController {
	public void onCloseMenuItemAction(final ActionEvent actionEvent) {
		Platform.exit();
	}
}
