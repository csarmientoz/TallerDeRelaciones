
package Punto4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

public class Recojeryponer {
        private Robot bgt7; 
        private Thing X1;
 
public Recojeryponer(City ciudad){
    this.bgt7=new Robot(ciudad, 1, 1, Direction.SOUTH);
}

public void asignaciones (City ciudad, int a, int e, int i, int o, int u){
    this.crearcosas1(ciudad, a);
    this.crearcosas2(ciudad, e);
    this.crearcosas3(ciudad, i);
    this.crearcosas4(ciudad, o);
    this.crearcosas5(ciudad, u);
    for(int k=0; k<5; k++){
    this.recojer();
    this.poner();
    }
    bgt7.move();

}
    public void recojer(){
        bgt7.move();
        while(bgt7.canPickThing()==true){
            bgt7.pickThing();
        }
        bgt7.turnLeft();
    }
    public void poner(){
        int h=0;
        while(bgt7.countThingsInBackpack()>0){
            bgt7.putThing();
            bgt7.move();
            h++;
        }
        bgt7.turnLeft();
        bgt7.turnLeft();
        for(int g=0; g<h; g++){
            bgt7.move();
        }
        bgt7.turnLeft();
    }

    public void crearcosas1(City ciudad, int a){
            for(int b=0; b<a; b++){
            this.X1= new Thing(ciudad,2,1);
            X1.setColor(Color.red);
        }
        
    }
    public void crearcosas2(City ciudad, int e){
            for(int b=0; b<e; b++){
            this.X1= new Thing(ciudad,3,1);
            X1.setColor(Color.red);
            }
}
    public void crearcosas3(City ciudad, int i){
            for(int b=0; b<i; b++){
            this.X1= new Thing(ciudad,4,1);
            X1.setColor(Color.red);
            }
}
    public void crearcosas4(City ciudad, int o){
            for(int b=0; b<o; b++){
            this.X1= new Thing(ciudad,5,1);
            X1.setColor(Color.red);
            }
}
    public void crearcosas5(City ciudad, int u){
            for(int b=0; b<u; b++){
            this.X1= new Thing(ciudad,6,1);
            X1.setColor(Color.red);
            }
}
}
