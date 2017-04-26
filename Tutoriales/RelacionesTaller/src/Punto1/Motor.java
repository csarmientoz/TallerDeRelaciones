package Punto1;


public class Motor {
    private String marca;
    private double caballos_de_fuerza;

    public Motor(String marca, double caballos_de_fuerza) {
        this.marca = marca;
        this.caballos_de_fuerza = caballos_de_fuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCaballos_de_fuerza() {
        return caballos_de_fuerza;
    }

    public void setCaballos_de_fuerza(double caballos_de_fuerza) {
        this.caballos_de_fuerza = caballos_de_fuerza;
    }
    
    
}