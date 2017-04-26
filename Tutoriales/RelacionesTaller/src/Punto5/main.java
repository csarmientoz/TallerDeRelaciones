package Punto5;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Category categoria = new Category("9717");
        Product p1 = new Product("9712");
        Product p2 = new Product("0010");
        p1.setNombre("papas");
        p1.setDescripcion("grandes");
        p2.setNombre("gaseosa");
        p2.setDescripcion("mediana");

        Item i1 = new Item("1515", "etiqueta", 1500);
        Item i2 = new Item("1616", "numeropapas", 2000);
        Item i3 = new Item("1212", "embalaje", 5000);
        Item i4 = new Item("2323", "temperaturafria", 500);

        p1.adicionarItem(i2);
        p1.adicionarItem(i1);
        p2.adicionarItem(i3);
        p2.adicionarItem(i4);
        categoria.adicionarProducto(p1);
        categoria.adicionarProducto(p2);

        ArrayList<Product> listap = categoria.listarProducto();

        Customer c1 = new Customer("Cristian", "Sarmiento", "3196869893", "carrera 76", "calle 80", "Bogota", "Cundinamarca", "111", "Colombia");
        c1.setId("4587777");

        System.out.println("Bienvenidos a la Tienda LA COSECHA");

        System.out.println("El cliente :" + c1.getFirstname() + " " + c1.getLastname() + " compró lo siguiente: ");
        for (Product p : listap) {

            System.out.println("Nombre del producto: " + p.getNombre() + " , " + " descripcion del item: " + p.getDescripcion() + " , " + "Código: " + p.getId());

            ArrayList<Item> listai = p.listarItem();
            for (Item y : listai) {

                System.out.println("Item del producto: " + y.getNombre() + " , " + "Costo del item: " + y.getUnitCost() + " , " + " Código: " + y.getId());

            }
        }
        System.out.println("Referencias del cliente:");
        System.out.println(" telefono " + c1.getTelephone());
        System.out.println(" Ciudad " + c1.getCity());
        System.out.println(" Estado " + c1.getState());
        System.out.println(" direccion " + c1.getStreet1() + " con " + c1.getStreet2());
        System.out.println(" identificacion " + c1.getId());
        System.out.println(" codigo postal " + c1.getZipcode());

//       for(Product p: listap){
//       
//           System.out.println();
//          }
    }

}
