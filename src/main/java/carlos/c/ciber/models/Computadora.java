package carlos.c.ciber.models;

import java.util.ArrayList;

public class Computadora extends Maquina {
    private String perifericos;

    public Computadora(){}

    public Computadora(String nombre, int cantidad, String perifericos) {
        super(nombre, cantidad);
        this.perifericos = perifericos;

    }

    @Override
    public String toString() {
        return   super.toString()+
                "Computadora{" +
                "perifericos='" + perifericos + '\'' +

                '}';
    }

    public String getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(String perifericos) {
        this.perifericos = perifericos;
    }

}
