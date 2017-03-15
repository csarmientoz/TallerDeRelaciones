
package restaurantealopaisa;
/**Clase para generar nuevos platos segun su nombre, con un codigo asignado, un precio y una cantidad*/
public class Plato {
    private String nombre;
    private int codigo;
    private double precio;
    private double cantidad;

    public Plato(String nombre, int codigo, double precio, double cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
