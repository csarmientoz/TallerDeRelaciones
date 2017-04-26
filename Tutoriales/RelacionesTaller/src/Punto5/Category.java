package Punto5;

import java.util.ArrayList;

public class Category extends DomainObject {

    private String nombre;
    private String descripcion;
    private final ArrayList<Product> products;

    public Category(String id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void adicionarProducto(Product producto) {
        this.products.add(producto);

    }

    public ArrayList<Product> listarProducto() {
        return this.products;

    }
}
