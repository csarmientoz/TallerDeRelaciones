
package restaurantealopaisa;

import java.util.Date;
/** plantilla para registrar las horas de entrada y salida de los empleados*/

public class TiempoTrabajado {
    private Empleado empleado;
    private Date dia;
    private String horallegada;
     private String horaSalida;

    public TiempoTrabajado(Empleado empleado, Date dia, String horallegada, String horaSalida) {
        this.empleado = empleado;
        this.dia = dia;
        this.horallegada = horallegada;
        this.horaSalida = horaSalida;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Date getDia() {
        return dia;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
     
     
}
