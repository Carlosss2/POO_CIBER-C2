package carlos.c.ciber.controller;

import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.ciber.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class DesisionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bottonXbox;

    @FXML
    private Button bttonCom;

    @FXML
    void botonXbox(MouseEvent event) {
        HelloApplication.newStage("Rentar-view","SERVICIO DE RENTA");
    }

    @FXML
    void bottonComp(MouseEvent event) {
        HelloApplication.newStage("RentarComp","SERVICIO DE RENTA");
    }

    @FXML
    void initialize() {
        assert bottonXbox != null : "fx:id=\"bottonXbox\" was not injected: check your FXML file 'Decision-view.fxml'.";
        assert bttonCom != null : "fx:id=\"bttonCom\" was not injected: check your FXML file 'Decision-view.fxml'.";

    }

}
