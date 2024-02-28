package carlos.c.ciber.controller;

import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.ciber.HelloApplication;
import carlos.c.ciber.models.Computadora;
import carlos.c.ciber.models.Consola;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class asignarCController {
    Consola consola=new Consola();
    Computadora computadora=new Computadora();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarComp;

    @FXML
    private Button agregarXbox;

    @FXML
    private TextField ingresaXbox;

    @FXML
    private TextField ingrsaComputadora;

    @FXML
    void agregarComp(MouseEvent event) {
        String name="Computadora";
        int comp= Integer.parseInt(ingrsaComputadora.getText());
        String control="SI";
        Computadora computadora1=new Computadora(name,comp,control);
        HelloApplication.getComputadora().addMaquina(computadora1);
        System.out.println("Nombre "+computadora1.toString());
    }


        @FXML
        void agregarXbox(MouseEvent event) {
            String name1="XBOX";
            int xbox = Integer.parseInt(ingresaXbox.getText());
            String perfifericos="SI";
            Consola consola1=new Consola(name1,xbox,perfifericos);

        }

    @FXML
    void initialize() {

    }

}
