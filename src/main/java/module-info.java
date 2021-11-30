module com.ptitbapt.celsusandfahrenheitrolegames {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.ptitbapt.celsusandfahrenheitrolegames to javafx.fxml;
    exports com.ptitbapt.celsusandfahrenheitrolegames;
    exports com.ptitbapt.celsusandfahrenheitrolegames.controller;
    opens com.ptitbapt.celsusandfahrenheitrolegames.controller to javafx.fxml;
}