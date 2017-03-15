
package restaurantealopaisa;
/**Se encarga de definir los costos fijos independientes de la actividad productiva*/
public class CostosFijos {
    private double impuesto;
    private double arriendo;
    private double servicioPublico;

    public CostosFijos(double impuesto, double arriendo, double servicioPublico) {
        this.impuesto = impuesto;
        this.arriendo = arriendo;
        this.servicioPublico = servicioPublico;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getArriendo() {
        return arriendo;
    }

    public double getServicioPublico() {
        return servicioPublico;
    }

    public void setImpuestos(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setArriendo(double arriendo) {
        this.arriendo = arriendo;
    }

    public void setServicioPublico(double servicioPublico) {
        this.servicioPublico = servicioPublico;
    }
    
    
}
