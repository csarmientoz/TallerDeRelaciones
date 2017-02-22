
package ejerciciopoo;

import ch.aplu.turtle.Turtle;

public class Casa {
    private Triangulo techo;
    private Rectangulo estructura;
    private Turtle tortuga;

    public Casa(Triangulo techo, Rectangulo estructura, Turtle tortuga) {
        this.techo = techo;
        this.estructura = estructura;
        this.tortuga = new Turtle();
    }

    Casa(Triangulo triangulo, Rectangulo rectangulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void dibujar(){
    this.techo.dibujar(tortuga);
    this.estructura.dibujar(tortuga);
    }
}

