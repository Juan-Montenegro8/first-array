package vista;

import java.util.*;
public class Sexto {

    public static void main(String[] args) {
        
        int numeros[]= new int[10];
        Random aleatorio = new Random();
        int posicion=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=aleatorio.nextInt(11);
            
            System.out.println("el numero es "+numeros[i]+" y la posicion "+i);
            
        }
        System.out.println("la posicion del mayor es "+posicion);
    }
}
//Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.