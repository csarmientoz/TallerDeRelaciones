
package restaurantealopaisa;
/**Plantilla para agregar empleados nuevos distinguibles por su nombre, identificacion y ocupacion*/

public class Empleado {
    private String nombre;
    private int identificacion;
    private String ocupacion;
   
    

    public Empleado(String nombre, int identificacion, String ocupacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.ocupacion = ocupacion;
  
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

   
    

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    

  

    
    
    
}
