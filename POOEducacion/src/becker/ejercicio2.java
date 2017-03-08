
package becker;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;


public class ejercicio2 {
    public static void main(String[] args){
    City bogota = new City();
    Wall pared1 = new Wall(bogota, 1, 1, Direction.WEST);
    Wall pared2 = new Wall(bogota, 2, 1, Direction.WEST);
    Wall pared3 = new Wall(bogota, 3, 1, Direction.WEST);
    Wall pared4 = new Wall(bogota, 4, 1, Direction.WEST);
    Wall pared5 = new Wall(bogota, 5, 1, Direction.WEST);
    Wall pared6 = new Wall(bogota, 1, 1, Direction.NORTH);
    Wall pared7 = new Wall(bogota, 1, 2, Direction.NORTH);
    Wall pared8 = new Wall(bogota, 1, 3, Direction.NORTH);
    Wall pared9 = new Wall(bogota, 1, 3, Direction.EAST);
    Wall pared10 = new Wall(bogota, 2, 3, Direction.EAST);
    Wall pared11 = new Wall(bogota, 3, 3, Direction.EAST);
    Wall pared12 = new Wall(bogota, 4, 3, Direction.EAST);
    Wall pared13 = new Wall(bogota, 5, 3, Direction.EAST);
    Wall pared14 = new Wall(bogota, 5, 1, Direction.SOUTH);
    Wall pared15 = new Wall(bogota, 5, 3, Direction.SOUTH);
    
    
    String numero0[] = {"d","e","f","a","b","c"};
    String numero2[] = {"d","e","g","b'","a'"};
    String numero6[] = {"d'","c'","g'","f","a","a'","f'","e'"};
 
    Robot r1 = new Robot(bogota, 6, 2, Direction.NORTH,0);
    
        dibujarNumero(numero6, r1);

}
    private static void dibujarNumero(String[] numero, Robot r1) {
        r1.move();
        for(int i = 0; i<numero.length;i++ ){
            switch(numero[i]){
              
                case "d'":{
                 r1.turnLeft();
                 r1.move();
                 r1.turnLeft();
                 r1.turnLeft();
                 r1.move();
                 r1.move();
                 break;
                }
                case "c'":{
                r1.turnLeft();
                r1.move();
                r1.move();
                break;
                }
                 case"g'":{
                r1.turnLeft();
                r1.move();
                r1.move();
                r1.turnLeft();
                r1.turnLeft();
                r1.turnLeft();
                break;
                 }
               
                
                case "f'":{
                r1.turnLeft();
                r1.move();
                r1.move();
                break;
                }
                case"e'":{
                r1.move();
                r1.move();
                break;
                
                }
        
                case "d":{
                   
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.turnLeft(); 
                    r1.move();
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    break;
                }
                case "e":{
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    break;
                }
                case "f":{
                    r1.move();
                    r1.move();
                    break;
                }
                case"a":{
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    break;
                }
                case "b": case"g":{
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    break;
                }
                case"c":{
                    r1.move();
                    r1.move();
                    break;
                }
                case"b'":{
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    break;
                }
                
                case "a'":{
                    if(r1.getDirection()==Direction.EAST){
                    r1.turnLeft();
                    }
                    r1.turnLeft();
                    r1.move();
                    r1.move();
                    
                    break;
                }
            }
        }
       
    }
}
