
package punto7;
import becker.robots.*;

public class main {
    public static void main(String[]args){
        City area7= new City(13,13);
        interfaz7 s= new interfaz7(area7);
        parte7 maqui= new parte7(area7);
        maqui.recorrer(area7);
        
    }
}
