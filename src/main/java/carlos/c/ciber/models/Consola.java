package carlos.c.ciber.models;

import java.util.ArrayList;

public class Consola extends Maquina{
    private String control;

    public Consola(String nombre, int cantidad, String control) {
        super(nombre, cantidad);
        this.control = control;

    }
    public Consola(){}


}
