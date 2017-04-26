package Punto1;

public class Ruedas {
    private String marca;
    private double tamaño_mm;

    public Ruedas(String marca, double tamaño_mm) {
        this.marca = marca;
        this.tamaño_mm = tamaño_mm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño_mm() {
        return tamaño_mm;
    }

    public void setTamaño_mm(double tamaño_mm) {
        this.tamaño_mm = tamaño_mm;
    }
    
    
}