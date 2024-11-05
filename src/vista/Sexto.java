package vista;

import java.util.*;
import java.util.Random;
public class Sexto {

    public static void main(String[] args) {
        
        Scanner t=new Scanner (System.in);
        int numeros[]= new int[10];
        Random aleatorio = new Random();
        String max="";
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=aleatorio.nextInt(11);
            int num;
            num = numeros[0];
            System.out.println("el numero es "+numeros[i]+" y la posicion "+i);
            if(num<numeros[i]){
                max=i+"";
            }
        }
        System.out.println("la posicion del mayor es "+max);
    }
}
//Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.