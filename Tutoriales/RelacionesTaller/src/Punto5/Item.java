package Punto5;

public class Item extends DomainObject {

    private String nombre;
    private double UnitCost;
    private Product product;

    public Item(String id, String nombre, double UnitCost) {
        this.nombre = nombre;
        this.UnitCost = UnitCost;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getUnitCost() {
        return UnitCost;
    }

    public Product getProduct() {
        return product;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnitCost(double UnitCost) {
        this.UnitCost = UnitCost;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setId(String id) {
        this.id = id;
    }

}
