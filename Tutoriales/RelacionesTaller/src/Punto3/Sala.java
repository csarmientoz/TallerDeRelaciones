package Punto3;

import java.util.ArrayList;

public class Sala {
    private ArrayList<Semana> semanas;

    public Sala(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }
     
}