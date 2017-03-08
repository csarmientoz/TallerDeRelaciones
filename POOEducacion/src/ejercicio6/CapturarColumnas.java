
package ejercicio6;

import java.util.Scanner;


public class CapturarColumnas {
    
    private Scanner teclado;

    public CapturarColumnas() {
        this.teclado = new Scanner(System.in);
        
    }
    
   public int capturarNumero() throws NumberFormatException {
        int x = -1;
        boolean valorok = true;
        do {
            try{
            System.out.println("Introduzca un numero del uno al diez");
            String entrada1 ="";
            
            entrada1 = teclado.nextLine();
            x = Integer.parseInt(entrada1);
            if(x>=1 && x <=10){
                valorok = false;
            }}
            catch(Exception ex){
                System.out.println("Introduzca solo numeros del uno al diez");
            }
        } while(valorok);
        return x;
    }
   
}
