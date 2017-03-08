package punto2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args){
    City bogota = new City(8,12);
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
    
    Wall pared16 = new Wall(bogota, 5, 4, Direction.SOUTH);
    Wall pared17 = new Wall(bogota, 5, 6, Direction.SOUTH);
    Wall pared18 = new Wall(bogota, 5, 7, Direction.SOUTH);
    Wall pared19 = new Wall(bogota, 5, 9, Direction.SOUTH);
    Wall pared20 = new Wall(bogota, 1, 4, Direction.NORTH);
    Wall pared21 = new Wall(bogota, 1, 5, Direction.NORTH);
    Wall pared22 = new Wall(bogota, 1, 6, Direction.NORTH);
    Wall pared23 = new Wall(bogota, 1, 7, Direction.NORTH);
    Wall pared24 = new Wall(bogota, 1, 8, Direction.NORTH);
    Wall pared25 = new Wall(bogota, 1, 9, Direction.NORTH);
    Wall pared26 = new Wall(bogota, 1, 7, Direction.WEST);
    Wall pared27 = new Wall(bogota, 2, 7, Direction.WEST);
    Wall pared28 = new Wall(bogota, 3, 7, Direction.WEST);
    Wall pared29 = new Wall(bogota, 4, 7, Direction.WEST);
    Wall pared30 = new Wall(bogota, 5, 7, Direction.WEST);
    Wall pared31 = new Wall(bogota, 1, 9, Direction.EAST);
    Wall pared32 = new Wall(bogota, 2, 9, Direction.EAST);
    Wall pared33 = new Wall(bogota, 3, 9, Direction.EAST);
    Wall pared34 = new Wall(bogota, 4, 9, Direction.EAST);
    Wall pared35 = new Wall(bogota, 5, 9, Direction.EAST);
    
    String[] patron;
    String[] patron1;
    String[] patron2;
    
   
    
    int[][] p0 = inicializarCoordenadas10();
    int[][] p1 = inicializarCoordenadas20(3);
    int[][] p2 = inicializarCoordenadas30(6);
            
            

    
    int numeroUsuario1 = capturarNumero();
       
             
      int numeroUsuario2 = capturarNumero();
      
      int numeroUsuario3 = capturarNumero();
      
      patron= retornarNumero(numeroUsuario1);
      patron1= retornarNumero(numeroUsuario2);
      patron2= retornarNumero(numeroUsuario3);
      

    Robot r1 = new Robot(bogota, 6, 2, Direction.NORTH,0);
        insertarPatron(p0, bogota);
        Robot r2 = new Robot(bogota, 6, 5, Direction.NORTH,0);
        insertarPatron(p1, bogota);
        Robot r3 = new Robot(bogota, 6,8, Direction.NORTH,0);
        insertarPatron(p2, bogota);
        
        dibujarNumero(patron,r1);
        System.out.println(" el robot r1 ha detectado el numero " +  numeroUsuario1);
        
        dibujarNumero(patron,r2);
        System.out.println(" el robot r2 ha detectado el numero " +  numeroUsuario2);
        
        dibujarNumero(patron,r3);
        System.out.println(" el robot r3 ha detectado el numero " +  numeroUsuario3);
}

   

     private static int[][] inicializarCoordenadas10() {
        int[][] p0 = new int[12][2];
        p0[0][0] = 1;
        p0[0][1] = 1;
        p0[1][0] = 2;
        p0[1][1] = 1;
        p0[2][0] = 3;
        p0[2][1] = 1;
        p0[3][0] = 4;
        p0[3][1] = 1;
        p0[4][0] = 5;
        p0[4][1] = 1;
        p0[5][0] = 5;
        p0[5][1] = 2;
        p0[6][0] = 5;
        p0[6][1] = 3;
        p0[7][0] = 4;
        p0[7][1] = 3;
        p0[8][0] = 3;
        p0[8][1] = 3;
        p0[9][0] = 2;
        p0[9][1] = 3;
        p0[10][0] = 1;
        p0[10][1] = 3;
        p0[11][0] = 1;
        p0[11][1] = 2;
        return p0;
    }
     private static int[][] inicializarCoordenadas20(int cor) {
        int[][] p1 = new int[12][2];
        p1[0][0] = 1;
        p1[0][1] = 1+cor;
        p1[1][0] = 2;
        p1[1][1] = 1+cor;
        p1[2][0] = 3;
        p1[2][1] = 1+cor;
        p1[3][0] = 4;
        p1[3][1] = 1+cor;
        p1[4][0] = 5;
        p1[4][1] = 1+cor;
        p1[5][0] = 5;
        p1[5][1] = 2+cor;
        p1[6][0] = 5;
        p1[6][1] = 3+cor;
        p1[7][0] = 4;
        p1[7][1] = 3+cor;
        p1[8][0] = 3;
        p1[8][1] = 3+cor;
        p1[9][0] = 2;
        p1[9][1] = 3+cor;
        p1[10][0] = 1;
        p1[10][1] = 3+cor;
        p1[11][0] = 1;
        p1[11][1] = 2+cor;
        return p1;
    }
     private static int[][] inicializarCoordenadas30(int corr) {
        int[][] p2 = new int[12][2];
        p2[0][0] = 1;
        p2[0][1] = 1+corr;
        p2[1][0] = 2;
        p2[1][1] = 1+corr;
        p2[2][0] = 3;
        p2[2][1] = 1+corr;
        p2[3][0] = 4;
        p2[3][1] = 1+corr;
        p2[4][0] = 5;
        p2[4][1] = 1+corr;
        p2[5][0] = 5;
        p2[5][1] = 2+corr;
        p2[6][0] = 5;
        p2[6][1] = 3+corr;
        p2[7][0] = 4;
        p2[7][1] = 3+corr;
        p2[8][0] = 3;
        p2[8][1] = 3+corr;
        p2[9][0] = 2;
        p2[9][1] = 3+corr;
        p2[10][0] = 1;
        p2[10][1] = 3+corr;
        p2[11][0] = 1;
        p2[11][1] = 2+corr;
        return p2;
    }
    private static int capturarNumero() throws NumberFormatException {
        int x = -1;
        boolean valorok = true;
        do {
            try{
            System.out.println("Introduzca un numero del cero al nueve");
            String entrada1 ="";
            Scanner teclado1 = new Scanner(System.in);
            entrada1 = teclado1.nextLine();
            x = Integer.parseInt(entrada1);
            if(x>=0 || x <=9){
                valorok = false;
            }}
            catch(Exception ex){
                System.out.println("Introduzca solo numeros de un digito del cero al nueve");
            }
        } while(valorok);
        return x;
    }
    
    private static void insertarPatron(int[][] coordenadas, City bogota){
    for(int i =0; i <coordenadas.length;i++ ){
    Thing bola1 = new Thing(bogota, coordenadas [i][0], coordenadas[i][1] );
    
    }
    
    }
    
    private static String[]retornarNumero(int numeroUsuario){
    switch(numeroUsuario){
        case 0:  {String numero0[] = {"m","r","m","l","l","s","r","s","s","r","s","r","s","s"};
        return numero0;}
        
        case 1: {String numero1[] = {"m","r","m","l","s","s"};
        return numero1;}
        
        case 2: {String numero2[] = {"m","r","m","l","l","s","r","s","r","s","l","s","l","s"};
        return numero2;}
        
        case 3:{String numero3[]= {"m","l","m","l","l","s","l","s","l","s","l","l","s","l","s","l","s"};
        return numero3;}
        
        case 4: {String numero4[] = {"m","r","m","l","s","s","l","l","s","r","s","r","s"};
        return numero4;}
        
        case 5: {String numero5[] ={"m","l","m","l","l","s","l","s","l","s","r","s","r","s"};
        return numero5;}
        
        case 6: { String numero6[] = {"m","r","m","l","s","l","s","l","s","l","l","s","s","r","s"};
        return numero6;}
        
        case 7: {String numero7[] ={"m","r","m","l","s","s","l","s"};
        return numero7;}
        
        case 8: {String numero8[] ={"m","r","m","l","l","s","r","s","s","r","s","r","s","s","l","l","s","l","s"};
        return numero8;}
        
        case 9: {String numero9[] = {"m","l","m","l","l","s","l","s","s","l","s","l","s","l","s"};
        return numero9;}
        } 
   
    
    return null;
    }


    
    private static void dibujarNumero(String[] numero, Robot r1) {
        
        for(int i = 0; i<numero.length;i++ ){
            switch(numero[i]){
                
                case "s":{
                moverRecoger(r1);
                moverRecoger(r1);
                break;
                }
                
                case "l":{
                r1.turnLeft();
                break;
                }
                
                case"r":{
                r1.turnLeft();
                r1.turnLeft();
                r1.turnLeft();
                break;
                }
                case "m":{
                 r1.move();
                  break;
                }
                }
            }
        }

    private static void moverRecoger(Robot r1) {
        r1.move();
        if(r1.canPickThing())
            r1.pickThing();
        
    }
       
    }


