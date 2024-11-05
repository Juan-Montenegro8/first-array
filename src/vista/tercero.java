package vista;
import java.util.*;
import java.util.Scanner;

public class tercero {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int n,con=0;
        System.out.println("ingrese longitud");
        n=t.nextInt();
        int numero[]= new int[n];
        System.out.println("ingrese numeros");
        for (int i = 0; i < numero.length; i++) {
            numero[i]=t.nextInt();
            if(numero[i]%3==0){
                System.out.println("es multiplo de 3 y esta en la posicion es "+i);
                con=1+con;
            }
        }
        System.out.println("la cantidad de multiplos es "+con);
    }
    
}
//Realizar un algoritmo que capture una lista de n datos enteros positivos, posteriormente, 
//imprima los múltiplos de 3 y las posiciones donde se encuentran almacenados y la cantidad de 
//múltiplos de 3 ingresados en la lista.