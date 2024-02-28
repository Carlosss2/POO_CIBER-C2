module carlos.c.ciber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;
    opens carlos.c.ciber to javafx.fxml;
    exports carlos.c.ciber;
    exports carlos.c.ciber.controller;
    opens carlos.c.ciber.controller to javafx.fxml;
}
