package Punto1;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList <Carro> carro;

    public Persona(String nombre, ArrayList<Carro> carro) {
        this.nombre = nombre;
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }
    public void ListarCarros(){
        for(int i= 0; i<this.carro.size(); i++){
        carro.get(i).mostrarelementos();
    }
    }
}