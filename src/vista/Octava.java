
package vista;

import java.util.Random;

public class Octava {

    public static void main(String[] args) {
        
        int vector[]=new int[10];
        Random ale=new Random();
        int mayor=0,repetido=0;
        for (int i = 1; i < vector.length; i++) {
            vector[i]=ale.nextInt(11);
            System.out.println("los numero son "+vector[i]);
            if(mayor<=vector[i]){
                mayor=vector[i];
            }
        }
        for (int i = 1; i < vector.length; i++){
            if(mayor==vector[i]){
                repetido+=1;
            }
        }
        System.out.println("el numero mayor es "+ mayor+" y se repite "+repetido);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el mayor.