package carlos.c.ciber.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import carlos.c.ciber.HelloApplication;
import carlos.c.ciber.models.Computadora;
import carlos.c.ciber.models.Maquina;
import carlos.c.ciber.models.Renta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RentarCompController {
    ArrayList<Renta> listaR= new ArrayList<Renta>();
    ArrayList<Computadora> listaC= new ArrayList<Computadora>();
    String total;
    String horas;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botonExitC;

    @FXML
    private TextField ingresaHoras;

    @FXML
    private TextField ingresaTotal;

    @FXML
    private Button listoRentaComp;

    @FXML
    void ingresaHoras(MouseEvent event) {
    //registrar horas en historial y dinero
        horas= String.valueOf(ingresaHoras);
    }

    @FXML
    void ingresaTotal(MouseEvent event) {
        total= String.valueOf(ingresaTotal);
    }


    @FXML
    void listoRentaComp(MouseEvent event) {
// mandar lista a en uso
     Renta renta=new Renta(horas,total);
     listaR.add(renta);
     String comp="Computadora";
     int cantidad=1;
     int uso=1;
     String perifericos="SI";
     Computadora computadora=new Computadora();

     listaC.add(computadora);
    }

    @FXML
    void initialize() {

    }

    public void botonExitC(MouseEvent mouseEvent) {
        System.exit(1);
    }
}
