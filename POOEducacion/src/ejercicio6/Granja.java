
package ejercicio6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


public class Granja {
    
     private int tamañoGranja;
    
     
     public Granja(int tamañoGranja) {
        this.tamañoGranja = tamañoGranja;
    }
     
     
    public void seembrar(Robot farmer, City ville){
        
        int contador = 1;
        
       for(int i=0; i<tamañoGranja;i++){
           
           for(int j=i; j<tamañoGranja; j++){
                
                    Thing seed = new Thing(ville,j,i);
                    
                    }
       }
    
    }
    public void pickSeeds(Robot farmer){
       for(int i=0; i<tamañoGranja; i++){
           for(int j=0; j<tamañoGranja; j++){
               
                 farmer.move();
           
                 if( farmer.canPickThing()){
                     farmer.pickThing();
                }
            
           }
          // if(i+1<tamañoGranja)
           if(farmer.getDirection()==Direction.NORTH)  
              turnRight(farmer);
           else
               giraIzquierda(farmer);
        }
    
    }

    private void turnRight(Robot farmer) {
        voltearDerecha(farmer);
        farmer.move();
        voltearDerecha(farmer);
        
        
    }

    private void voltearDerecha(Robot farmer) {
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.turnLeft();
    }
    private void giraIzquierda(Robot farmer){
      farmer.turnLeft();
      farmer.move();
      farmer.turnLeft();
    }
    
    public void posicionar(Robot farmer){
        int contador = 0;
        if(farmer.getDirection()==Direction.NORTH){
           farmer.turnLeft();
           farmer.turnLeft();
         do{   
            farmer.move();
            }
         while(contador<tamañoGranja-1);
         farmer.turnLeft();
         }

           else{
            voltearDerecha(farmer);}
       do{
       farmer.move();
       contador ++;
       }
       while(contador<tamañoGranja-1);
       voltearDerecha(farmer);
    }
    
      public void ordenar(Robot farmer){
          int contador = 1;
          
         for(int i=0; i<tamañoGranja; i++){
             int incremento=0;
            do{
            farmer.move();
            farmer.putThing();
            incremento++;
            }
            while(incremento<contador);
              contador ++;
              if(farmer.getDirection()==Direction.NORTH)
                 farmer.move();
            
              if(farmer.getDirection()==Direction.NORTH)  
              turnRight(farmer);
              else
              giraIzquierda(farmer);
            
         }
            
}
    
     
}
