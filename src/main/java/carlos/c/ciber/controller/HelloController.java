package carlos.c.ciber.controller;

import carlos.c.ciber.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button botonAgregar;

    @FXML
    private Button botonDisponibleMenu;

    @FXML
    private Button botonRentarMenu;

    @FXML
    private Button botonRetirarMenu;

    public static void init(Stage stageRoot) {
    }

    @FXML
    void botonAgregar(MouseEvent event) {
       HelloApplication.newStage("asignarC-view","Agregar maquinas");
    }

    @FXML
    void bottonDisponible(MouseEvent event) {
       HelloApplication.newStage("Disponibles-view","Ciber-style-disponibles");
    }

    @FXML
    void bottonRentar(MouseEvent event) {
        HelloApplication.newStage("Decision-view","Equipo a rentar");
    }

    @FXML
    void bottonRetirar(MouseEvent event) {
         HelloApplication.newStage("retirar-view","Retirar-equipos");
    }

}
