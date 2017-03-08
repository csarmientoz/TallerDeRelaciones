package punto1;
import becker.robots.City;
import becker.robots.Direction;
import  static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.Thing;
  
  

public class futbol {
private City ciudad;
private Robot robot;
private Thing balon;

public futbol() {
this.ciudad = new  City();
this.robot = new Robot  (ciudad,4,8, Direction.WEST);
this.balon = new Thing (ciudad,4,8);
} 
public void jugar(){
this.robot.pickThing();
this.accion();
this.accion();
this.advance2();
this.recoger();
this.advanceLeft();
this.advance();
this.advanceRight();
this.advance2();
this.robot.putThing();
}
private void advance(){
this.robot.move();}
private void advanceLeft(){
this.robot.turnLeft();}
private void advanceRight(){
    for (int i = 0; i < 3; i++) {
    this.robot.turnLeft();  
    }}
private void advance2(){
this.robot.move();
this.robot.move();}
private void recoger(){
this.robot.putThing();
this.robot.pickThing();} 
private void accion(){
this.robot.move();
this.robot.move();
for (int i = 0; i < 3; i++) {
    this.robot.turnLeft();  
    }
this.robot.move();
this.robot.putThing();
this.robot.pickThing();
this.robot.turnLeft();}
}
