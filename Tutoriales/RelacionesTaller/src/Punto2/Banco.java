package Punto2;

import java.util.ArrayList;


public class Banco {
private ArrayList<Tipo> tipos;
private ArrayList<Cuenta> cuentas;

    public Banco(ArrayList<Tipo> tipos, ArrayList<Cuenta> cuentas) {
        this.tipos = tipos;
        this.cuentas = cuentas;
    }

    public void addType( Tipo t )
    {
        tipos.add( t );
    }
    public void mascuentas(Cuenta a){
        cuentas.add(a);
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "Banco" + "cuentas=" + cuentas;
    }
   

    
}