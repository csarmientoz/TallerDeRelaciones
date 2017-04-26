package Punto2;

import java.util.Date;


public class Movimiento {
private Date date;
private double saldoAnterior;
private double cantidad;
private Tipo _tipo;

    public Movimiento(Date date, double saldoAnterior, double cantidad, Tipo _tipo) {
        this.date = date;
        this.saldoAnterior = saldoAnterior;
        this.cantidad = cantidad;
        this._tipo = _tipo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return _tipo;
    }

    public void setTipo(Tipo _tipo) {
        this._tipo = _tipo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "date=" + date + ", saldoAnterior=" + saldoAnterior + ", cantidad=" + cantidad + ", _tipo=" + _tipo + '}';
    }


}
