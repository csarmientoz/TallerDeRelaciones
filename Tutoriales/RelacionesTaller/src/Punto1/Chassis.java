package Punto1;

public class Chassis {
 private String referencia;
 private String marca;

    public Chassis(String referencia, String marca) {
        this.referencia = referencia;
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
 
}