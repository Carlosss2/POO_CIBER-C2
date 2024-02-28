package carlos.c.ciber.models;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class Maquina {
    private String nombre;
    private int cantidad;
    private int enUso=0;
    ArrayList<Computadora>list=new ArrayList<>();
    public int getEnUso() {
        return enUso;
    }

    public void setEnUso(int enUso) {
        this.enUso = enUso;
    }

    public Maquina() {

    }
    public Maquina(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;

    }

    public ArrayList<Computadora> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", enUso=" + enUso +

                '}';
    }

    public void setList(ArrayList<Computadora> list) {
        this.list = list;
    }
public boolean addMaquina(Computadora computadora){
        return list.add(computadora);
}
}
