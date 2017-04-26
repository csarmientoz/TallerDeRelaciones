
package Punto7;


public class ExplicaciónTeóricaSegundoCódigo {
    
//    La salida en pantalla es:
//    G
//    G 1 G 2 
//    F
//    G 1 G 2 
//    F
//    G 1 E 2 G 1 
//    F
//    H 1 E 2 H 1 
//    
//    
//    
//    En este código se muestran los usos básicos de la Herencia y ek Polimorfismo.
//    El polimorfismo se ejemplifica con la clase "G", la cual yo puedo instanciar en términos de
//    sus clases hijas:
//            Ej:
//            G g = new H();
//            G g1 = new E();
//            G g2 = new F();
            
//     En este caso las únicas clases que possen el toString son la clase G y la clase F
//     Como las clases E y H no poseen el toString, estas solicitan ayuda, por herencia,
//     a las clases que si posean el toString.Es por lo anterior que solo
//     aparecen como encabezados las clases G (una vez) y la clase
//     F(3 veces).Para este caso, todas las clases estan conectadas
//     con herencia. De la misma manera, la única clase con los dós métodos, es
//     la clase G, entonces como en el main se pide ejercutar el método uno y luego
//     el método dos, lo que hace el programa es recurrir a aquellas clases que posean 
//     dicho método para el orden del vector especificado en el ciclo for.
}
