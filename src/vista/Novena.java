package vista;

import java.util.*;

public class Novena {

    public static void main(String[] args) {
        
        int numero[]=new int[10];
        Random aleatorio=new Random();
        double promedio,contador=0,repeticiones=0;
        for (int i = 0; i < numero.length; i++) {
            numero[i]=aleatorio.nextInt(11);
            System.out.println("Numero "+numero[i]);
            contador+=numero[i];
            repeticiones+=1;
        }
        promedio=contador/repeticiones;
        System.out.println("el promedio es "+promedio);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar si el promedio entero de estos datos 
//está almacenado en el vector.