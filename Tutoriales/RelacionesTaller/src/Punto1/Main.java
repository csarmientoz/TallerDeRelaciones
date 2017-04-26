package Punto1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ruedas[] roue= new Ruedas[4];
        roue[0]= new Ruedas("Michellin", 100);
        roue[1]= new Ruedas("Michellin", 100);
        roue[2]= new Ruedas("Michellin", 100);
        roue[3]= new Ruedas("Michellin", 100);
        Motor motor= new Motor("lamborghini", 50);
        Carro car= new Carro("Ferrari", motor, roue);
        Ruedas[] roues= new Ruedas[4];
        roues[0]= new Ruedas("Michellin", 40);
        roues[1]= new Ruedas("Michellin", 40);
        roues[2]= new Ruedas("Michellin", 40);
        roues[3]= new Ruedas("Michellin", 40);
        Carro car2= new Carro("Audi", motor, roues);
        ArrayList <Carro> c1 = new ArrayList<>() ;
        c1.add(car);
        c1.add(car2);
        Persona p= new Persona("Carlos", c1);
        p.ListarCarros();
    }
    
}