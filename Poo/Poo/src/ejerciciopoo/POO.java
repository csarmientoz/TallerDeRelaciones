package ejerciciopoo;

import ch.aplu.turtle.Turtle;


public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
      joe.forward(20);
   } 
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }
    
}
