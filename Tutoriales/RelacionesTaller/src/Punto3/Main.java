package Punto3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Segmento segm1= new Segmento(08.30,10.30);
        ArrayList<Segmento> segmentos1= new ArrayList<>();
        segmentos1.add(segm1);
        
        Segmento segm2= new Segmento(10.35,12.34);
        ArrayList<Segmento> segmentos2= new ArrayList<>();
        segmentos2.add(segm2);
        
        Segmento segm3= new Segmento(12.34, 13.37);
        ArrayList<Segmento> segmentos3= new ArrayList<>();
        segmentos3.add(segm3);
        
        Segmento segm4= new Segmento(09.15, 10.45);
        ArrayList<Segmento> segmentos4= new ArrayList<>();
        segmentos4.add(segm4);
        
        Segmento segm5= new Segmento(14.07, 15.28);
        ArrayList<Segmento> segmentos5= new ArrayList<>();
        segmentos5.add(segm5);
        
        Segmento segm6= new Segmento(15.09, 19.58);
        ArrayList<Segmento> segmentos6= new ArrayList<>();
        segmentos6.add(segm6);
        
        Segmento segm7= new Segmento(06.34, 09.51);
        ArrayList<Segmento> segmentos7= new ArrayList<>();
        segmentos7.add(segm7);
        
        Segmento segm8= new Segmento(02.38, 09.59);
        ArrayList<Segmento> segmentos8= new ArrayList<>();
        segmentos8.add(segm8);
        
       
        
        ArrayList<Semana> semanas1= new ArrayList<>();
        ArrayList<Semana> semanas2= new ArrayList<>();
        ArrayList<Sala> salas= new ArrayList<>();
        Sala sala1= new Sala(semanas1);
        Sala sala2= new Sala(semanas2);
        salas.add(sala1);
        salas.add(sala2);
        
        
        Dia d1[]= new Dia[5];
        d1[0]= new Dia("25/04/2017", "Martes", segmentos1);
        d1[1]= new Dia("26/04/2017", "Miercoles", segmentos2);
        Dia d2[]= new Dia[5];     
        d2[0]= new Dia("03/05/2017", "Miercoles", segmentos3);
        d2[1]= new Dia("05/05/2017", "Viernes", segmentos4);
        Dia d3[]= new Dia[5];
        d3[0]= new Dia("25/04/2017", "Lunes", segmentos5);
        d3[1]= new Dia("26/04/2017", "Viernes", segmentos6);
        Dia d4[]= new Dia[5];     
        d4[0]= new Dia("03/05/2017", "Martes", segmentos7);
        d4[1]= new Dia("05/05/2017", "Jueves", segmentos8);
        
        
        Semana s1= new Semana(d1, 17, salas);
        Semana s2= new Semana(d2, 19, salas);
        Semana s3= new Semana(d3, 21, salas);
        Semana s4= new Semana(d4, 22, salas);
        semanas1.add(s1);
        semanas1.add(s2);
        semanas2.add(s3);
        semanas2.add(s4);
        Programacion p1= new Programacion(salas);
        
        p1.ListarTodo();
        
        s3.CalculoTiempoLibre();
    }
}