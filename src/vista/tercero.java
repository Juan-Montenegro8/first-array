package vista;
import java.util.*;

public class tercero {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner (System.in)){
            int longitud,contador=0;
            System.out.println("ingrese longitud");
            longitud=textoScanner.nextInt();
            int numero[]= new int[longitud];
            System.out.println("ingrese numeros");
            for (int i = 0; i < numero.length; i++) {
                numero[i]=textoScanner.nextInt();
                if(numero[i]%3==0){
                    System.out.println(numero[i]+" Es multiplo de 3 y esta en la posicion es "+i);
                    contador=+1;
                }
            }   
            System.out.println("La cantidad de multiplos es "+contador);
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        }
        
    }
    
}
//Realizar un algoritmo que capture una lista de n datos enteros positivos, posteriormente, 
//imprima los múltiplos de 3 y las posiciones donde se encuentran almacenados y la cantidad de 
//múltiplos de 3 ingresados en la lista.