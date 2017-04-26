package Punto3;

import java.util.ArrayList;

public class Programacion {
    private ArrayList<Sala> salas;

    public Programacion(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    public void ListarTodo(){
        for(int i=0; i<salas.size(); i++){
            System.out.println("Sala No. "+ (i+1));
            for(int e=0; e<salas.get(i).getSemanas().size(); e++){
                
                    System.out.print("Semana No. ");
                    System.out.println(salas.get(i).getSemanas().get(e).getNumero()+ " ");
                
                for (int a=0; a<salas.get(i).getSemanas().get(e).getDias_laborales().length; a++) {
                    if(salas.get(i).getSemanas().get(e).getDias_laborales()[a]!=null){
                    System.out.println("Dia: ");
                    System.out.print(salas.get(i).getSemanas().get(e).getDias_laborales()[a].getNombre()+ " ");
                    System.out.println(salas.get(i).getSemanas().get(e).getDias_laborales()[a].getFecha());
                    
                    for(int k=0; k<salas.get(i).getSemanas().get(e).getDias_laborales()[a].getSegm().size(); k++){
                    System.out.println("Segmento: ");
                    System.out.print("Inicio: ");
                    System.out.print(salas.get(i).getSemanas().get(e).getDias_laborales()[a].getSegm().get(k).getHoraDeInicio()+" --- ");
                    System.out.print("Final: ");
                    System.out.println(salas.get(i).getSemanas().get(e).getDias_laborales()[a].getSegm().get(k).getHoraFinal());
                    }
                    }
                }
                System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
          
    }
    
    
}
}
