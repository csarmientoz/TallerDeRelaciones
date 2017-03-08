
package ejercicio6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;



public class Organizador {
    
    
    public static void main(String[] args) {
    
      City ville = new City(9,9);  
       CapturarColumnas capturar = new CapturarColumnas();
       int x = capturar.capturarNumero();
       Robot farmer = new Robot(ville, x, 0, Direction.NORTH,0);
       Granja koala = new Granja(x);
         koala.seembrar(farmer, ville);
         koala.pickSeeds(farmer);
        // koala.posicionar(farmer);
         koala.ordenar(farmer);
       
       
       
}
    
}
