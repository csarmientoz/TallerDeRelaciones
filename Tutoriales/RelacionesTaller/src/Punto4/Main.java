package punto4;


public class Main {
public static void main(String[]args){
Date fecha= new Date (1,1,2004,"miercoles","enero");
Person persona= new Person (fecha);
    System.out.println(persona);
fecha.Bisiesto();
}    
}