package vista;

import java.util.*;

public class quinta {

    public static void main(String[] args) {
        
        int vector1[]=new int[3];
        Random aleatorio1=new Random();
        int promedio1=0;
        System.out.println("****************************VECTOR 1*********************************");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i]=aleatorio1.nextInt(11);
            System.out.println("numero "+vector1[i]);
            promedio1=vector1[0]+vector1[1]+vector1[2]/3;
        }
        
        int vector2[]=new int[3];
        Random aleatorio2=new Random();
        int promedio2=0;
        System.out.println("****************************VECTOR 2*********************************");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]=aleatorio2.nextInt(11);
            System.out.println("numero"+vector2[i]);
            promedio2=vector1[0]+vector1[1]+vector1[2]/3;
        }
        
        int vector3[]=new int[3];
        Random aleatorio3=new Random();
        int promedio3=0;
        System.out.println("****************************VECTOR 3*********************************");
        for (int i = 0; i < vector3.length; i++) {
            vector3[i]=aleatorio3.nextInt(11);
            System.out.println("numero"+vector3[i]);
            promedio3=vector1[0]+vector1[1]+vector1[2]/3;
        }
        
        if(promedio1<=promedio2){
            System.out.println("el promedio del vector2 es mayor o igual al vector 1"
                    + "con un promedio de "+promedio2);
        }else{
            System.out.println("el promedio del vector2 es menor al vector 1"
                    + "con un promedio de"+promedio2);
        }
        
        if(promedio1<=promedio3){
           System.out.println("el promedio del vector3 es mayor o igual al vector 1"
                   + "con un promedio de"+promedio3); 
        }else{
            System.out.println("el promedio del vector3 menor al vector 1"
                    + "con un promedio de"+promedio3);
        }
    }
    
}
//Hacer un algoritmo que forme un vector del que no se sabe el número de elementos. Calcule el promedio 
//de los elementos y forme dos nuevos arreglos, uno con los elementos menores o iguales al promedio y 
//otro con los superiores, Imprima los dos nuevos vectores.