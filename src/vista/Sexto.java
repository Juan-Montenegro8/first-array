package vista;

import java.util.*;
public class Sexto {

    public static void main(String[] args) {
        
        int numeros[]= new int[10];
        Random aleatorio = new Random();
        int posicion=0;
        int contenedor=0;
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            boolean repetido;

            do { 
                repetido= false;
                numero=aleatorio.nextInt(11);
                for (int j = 0; j < i; j++){
                    if (numeros[j]==numero) {
                        repetido= true;
                        break;
                    }
                }
                    
            }while (repetido);
            
            numeros[i]=numero;
            System.out.println("El numero es "+numeros[i]+" y la posicion "+i);

            if (contenedor<numeros[i]) {
                contenedor=numeros[i];
                posicion=i;
            }
        }
        System.out.println("La posicion del mayor es "+posicion+" y el numero es "+contenedor);
    }
}
//Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.
