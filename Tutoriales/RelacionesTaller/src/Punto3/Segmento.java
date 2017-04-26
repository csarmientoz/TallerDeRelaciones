package Punto3;


public class Segmento {
    private double HoraDeInicio;
    private double HoraFinal;

    public Segmento(double HoraDeInicio, double HoraFinal) {
        this.HoraDeInicio = HoraDeInicio;
        this.HoraFinal = HoraFinal;
    }

    public double getHoraDeInicio() {
        return HoraDeInicio;
    }

    public void setHoraDeInicio(double HoraDeInicio) {
        this.HoraDeInicio = HoraDeInicio;
    }

    public double getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(double HoraFinal) {
        this.HoraFinal = HoraFinal;
    }
    
    
}