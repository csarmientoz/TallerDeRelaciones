
package restaurantealopaisa;
/**Plantilla que se asocia con la clase Empleado para relacionar los pagos respectivos*/
public class Nomina {
    private Empleado empleado;
    private double sueldo;
    private double prima;
    private double liquidacion;

    public Nomina(Empleado empleados, double sueldo, double prima, double liquidacion) {
        this.empleado = empleados;
        this.sueldo = sueldo;
        this.prima = prima;
        this.liquidacion = liquidacion;
    }

    public Empleado getEmpleados() {
        return empleado;
    }

    public double getSueldos() {
        return sueldo;
    }

    public double getPrimas() {
        return prima;
    }

    public double getLiquidaciones() {
        return liquidacion;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleado = empleados;
    }

    public void setSueldos(double sueldos) {
        this.sueldo = sueldos;
    }

    public void setPrimas(double primas) {
        this.prima = primas;
    }

    public void setLiquidaciones(double liquidaciones) {
        this.liquidacion = liquidaciones;
    }
    
    
}
