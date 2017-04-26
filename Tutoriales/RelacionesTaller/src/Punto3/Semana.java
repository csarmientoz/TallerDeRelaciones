package Punto3;

import java.util.ArrayList;

public class Semana {
    private Dia[] dias_laborales;
    private int numero;
    private ArrayList<Sala> salas;

    public Semana(Dia[] dias_laborales, int numero, ArrayList<Sala> salas) {
        this.dias_laborales = dias_laborales;
        this.numero = numero;
        this.salas= salas;
    }

    
    public Dia[] getDias_laborales() {
        return dias_laborales;
    }

    public void setDias_laborales(Dia[] dias_laborales) {
        this.dias_laborales = dias_laborales;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public ArrayList<Segmento> CalculoTiempoLibre(){
        ArrayList <Segmento> TLibre= new ArrayList<>();
        double e1=0;
        int dias_libres=2;
        double horas_libres=0;
        double minutos_libres=0;
        for(int i=0; i<dias_laborales.length; i++){
           if(dias_laborales[i]==null){
               dias_libres+=1;
           }else{ 
           for(int j=0; j<dias_laborales[i].getSegm().size(); j++){
           double w=(int)dias_laborales[i].getSegm().get(j).getHoraDeInicio();
           double x=(int)dias_laborales[i].getSegm().get(j).getHoraFinal();
           double y= x-w;
           double z= 24-y;
           horas_libres+=z-0.5;
           
           for(int k=0; k<dias_laborales[i].getSegm().size(); k++){
           double a=(dias_laborales[i].getSegm().get(j).getHoraDeInicio())-((int)dias_laborales[i].getSegm().get(j).getHoraDeInicio());
           double b=(dias_laborales[i].getSegm().get(j).getHoraFinal())-((int)dias_laborales[i].getSegm().get(j).getHoraFinal());
           double c= b-a;
           double d= (0.60-c);
           
           e1+= d;
           
           }
           
        }
        }
        }
        minutos_libres=(e1-0.60)*100;
        System.out.println("Dias libres: "+ dias_libres);
        System.out.println("Horas libres: "+ (int)horas_libres);
        System.out.println("Minutos libres: "+ minutos_libres);
        return null;
    }
}