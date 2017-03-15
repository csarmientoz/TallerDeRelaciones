
package restaurantealopaisa;
/**Inventario en bodega del stock de platos*/

public class Inventario {
    private Plato producto;
    private double cantidadProducto;
    private double valorTotal;

    public Inventario(Plato producto, double cantidadProducto, double valorTotal) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.valorTotal = valorTotal;
    }

    public Plato getProducto() {
        return producto;
    }

    public double getCantidadProducto() {
        return cantidadProducto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setProducto(Plato producto) {
        this.producto = producto;
    }

    public void setCantidadProducto(double cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
