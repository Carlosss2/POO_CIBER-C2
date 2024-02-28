package carlos.c.ciber.controller;

import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.ciber.models.Computadora;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class RetirarController {
    Computadora computadora=new Computadora();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bottonRetirarEquipos;

    @FXML
    private ListView<?> listEnUso;

    @FXML
    private Button mostrarEquiposenuso;

    @FXML
    void botonRetiraEquipo(MouseEvent event) {
//elimina de arriba hacia abajo
    }

    @FXML
    void listEnUso(MouseEvent event) {

    }

    @FXML
    void mostrarEquipos(MouseEvent event) {
    }

    @FXML
    void initialize() {
        assert bottonRetirarEquipos != null : "fx:id=\"bottonRetirarEquipos\" was not injected: check your FXML file 'retirar-view.fxml'.";
        assert listEnUso != null : "fx:id=\"listEnUso\" was not injected: check your FXML file 'retirar-view.fxml'.";
        assert mostrarEquiposenuso != null : "fx:id=\"mostrarEquiposenuso\" was not injected: check your FXML file 'retirar-view.fxml'.";

    }

}
