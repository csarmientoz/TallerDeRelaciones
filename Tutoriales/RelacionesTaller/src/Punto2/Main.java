package Punto2;

import java.util.ArrayList;
import java.util.Date;


public class Main {

    
    public static void main(String[] args) {
    ArrayList <Cuenta> cuentas= new ArrayList<>();
    cuentas.add( new Cuenta( 1,2, new Date( ), "2") );
    cuentas.add( new Cuenta(3,4, new Date(),"3" ) );
    ArrayList <Tipo> tipos= new ArrayList<>();
    tipos.add (new Tipo("got_it"));
    tipos.add (new Tipo("la.mejor"));
    Banco banco = new Banco( tipos, cuentas );
        System.out.print(banco);    
        
    }
  
}