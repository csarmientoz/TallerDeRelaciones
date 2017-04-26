package Punto2;

import java.util.ArrayList;
import java.util.Date;


public class Cuenta {
private int numeroCuenta;
private double saldoCuenta;
private Date fechaCreacion;
private String Ncliente;
private ArrayList movimientos;
    public Cuenta(int numeroCuenta, double saldoCuenta, Date fechaCreacion, String Ncliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.fechaCreacion = fechaCreacion;
        this.Ncliente = Ncliente;
        this.movimientos= new ArrayList<>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNcliente() {
        return Ncliente;
    }

    public void setNcliente(String Ncliente) {
        this.Ncliente = Ncliente;
    }

    public ArrayList getMovimientos() {
        return movimientos;
    }

    @Override
    public String toString() {
        return "Cuenta" + "numeroCuenta=" + numeroCuenta + ", saldoCuenta=" + saldoCuenta + ", fechaCreacion=" + fechaCreacion + ", Ncliente=" + Ncliente + ", movimientos=" + movimientos;
    }

}