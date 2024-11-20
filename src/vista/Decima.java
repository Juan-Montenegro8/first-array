package vista;
import java.util.*;
public class Decima {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int posicionMayor = 0;
        int sumaMayor = 0;
        Random aleatorio=new Random();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = aleatorio.nextInt();

            int sumaDigitos = sumaDeDigitos(numeros[i]);
            if (sumaDigitos > sumaMayor) {
                sumaMayor = sumaDigitos;
                posicionMayor = i;
            }
        }

        System.out.println("El número con la mayor suma de dígitos está en la posición: " + posicionMayor);
        System.out.println("Número: " + numeros[posicionMayor] + ", Suma de dígitos: " + sumaMayor);
    }

    // Método para calcular la suma de los dígitos de un número
    public static int sumaDeDigitos(int numero) {
        numero = Math.abs(numero); // Asegurarse de que sea positivo
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}

//Leer 10 números enteros, almacenarlos en un vector y determinar en qué posición está el número cuya suma de 
//dígitos sea la mayor.

