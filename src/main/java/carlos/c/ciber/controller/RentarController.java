package carlos.c.ciber.controller;

import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.ciber.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RentarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botonExit;

    @FXML
    private TextField ingreseHoras;

    @FXML
    private TextField ingreseTotal;

    @FXML
    private Button listoRenta;

    @FXML
    void botonExit(MouseEvent event) {
         System.exit(1);
    }

    @FXML
    void ingresaHoras(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
