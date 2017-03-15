
package restaurantealopaisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//*Esta clase ejecuta el programa completo */

public class Administracion {

    
    public static void main(String[] args) {
        
    TreeMap<String, Empleado> empleados;
    
      empleados = new TreeMap<>();
   
        /**se generan los empleados existentes antes de la implemenacion del programa*/
        Empleado empleado1 = new Empleado("Juan", 0102, "mesero");
        Empleado empleado2 = new Empleado("Felipe", 0202, "mesero");
        Empleado empleado3 = new Empleado("Adriana", 0302, "caja");
        Empleado empleado4 = new Empleado("Ana", 0402, "cocinera");
        Empleado empleado5 = new Empleado("Cristian", 0502, "caja");
        Empleado empleado6 = new Empleado("Ernesto", 0602, "mesero");
        Empleado empleado7 = new Empleado("Luisa", 0702, "mesera");
        Empleado empleado8 = new Empleado("Sergio", 0203, "cocinero");
        
        empleados.put(empleado1.getNombre(), empleado1);
        empleados.put(empleado2.getNombre(), empleado2);
        empleados.put(empleado3.getNombre(), empleado3);
        empleados.put(empleado4.getNombre(), empleado4);
        empleados.put(empleado5.getNombre(), empleado5);
        empleados.put(empleado6.getNombre(), empleado6);
        empleados.put(empleado7.getNombre(), empleado7);
        empleados.put(empleado8.getNombre(), empleado8);
       
        empleados.remove("Ana");
       
        /** Se esta haciendo uso de las colecciones, en este casp TreeMap*/
        for(Map.Entry<String,Empleado>empleado:empleados.entrySet()){
            System.out.println("nombre del empleado: " + empleado.getValue().getNombre());
            System.out.println("ID del empleado: " + empleado.getValue().getIdentificacion());
            System.out.println("Ocupacion del empleado: " + empleado.getValue().getOcupacion());
        }
        
        /**Metodos donde se instancian las clases para mostrar un ejemplo del funcionamiento del restaurante*/
        CostosFijos año2017 = new CostosFijos(1200000, 1500000, 350000);
        System.out.println("Impuestos: " + año2017.getImpuesto() + " Arriendo mensual: " + año2017.getArriendo() + " Servicios Publicos: " + año2017.getServicioPublico());
   
        Plato platoPrincipal = new Plato("Bandeja Paisa", 35789, 8500, 1.2);
        System.out.println("El plato principal es " + platoPrincipal.getNombre() + " con codigo " + platoPrincipal.getCodigo() + " con un precio de " + platoPrincipal.getPrecio() + " y una cantidad de " + platoPrincipal.getCantidad() + " Kilos ");
        
        Inventario stock = new Inventario(platoPrincipal, 25, 212500);
        System.out.println("Actualmente el inventario cuenta con bandejas paisas  " + " en una cantidad de " + stock.getCantidadProducto() + " y un monto total de " + stock.getValorTotal());
   
        Empleado uno = new Empleado("Jorge", 2587, "mesero");
        
        Nomina inicial = new Nomina(uno, 1200000, 500000, 1500000);
        System.out.println("Pagos a un mesero"  + inicial.getSueldos() + " " + inicial.getPrimas() + " " + inicial.getLiquidaciones());
        
    } 
    
    
    
       
}
