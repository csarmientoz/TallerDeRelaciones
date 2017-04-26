package Punto3;

import java.util.ArrayList;
import java.util.Date;

public class Dia {
    private ArrayList <Segmento>  segmentos;
    private String fecha;
    private String nombre;

    public Dia(String fecha, String nombre, ArrayList <Segmento>  segmentos) {
        this.segmentos = segmentos;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegm() {
        return segmentos;
    }

    public void setSegm(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}