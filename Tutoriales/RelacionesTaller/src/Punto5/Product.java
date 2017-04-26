package Punto5;

import java.util.ArrayList;

public class Product extends DomainObject {

    private String nombre;
    private String descripcion;
    private Category category;
    private ArrayList<Item> items;

    public Product(String id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public void adicionarItem(Item thing) {
        this.items.add(thing);

    }

    public ArrayList<Item> listarItem() {
        return this.items;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setId(String id) {
        this.id = id;
    }

}
