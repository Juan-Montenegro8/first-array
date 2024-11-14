
package vista;

import java.util.Random;

public class Octava {

    public static void main(String[] args) {
        
        int vector[]=new int[10];
        Random ale=new Random();
        int contenedor=0;
        for (int i = 1; i < vector.length; i++) {
            vector[i]=ale.nextInt(11);
            System.out.println("los numero son "+vector[i]);
            if(contenedor<=vector[i]){
                contenedor=vector[i];
            }
        }
        
        System.out.println("las veces que se repite el mayor es "+contenedor);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el mayor.