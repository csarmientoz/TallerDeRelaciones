
package ejerciciopoo;

public class Main {
    public static void main(String[] args){
    Rectangulo rectangulo = new Rectangulo(10, 20);
    Triangulo triangulo = new Triangulo(10);
    Casa casa = new Casa(triangulo, rectangulo);
    casa.dibujar();
    }
}
