package vista;
import java.util.*;
public class primero {

    public static void main(String[] args) {
        Scanner TextoScanner=new Scanner (System.in);
        int numero[]= new int[12];
        int contador=0, mayor=0,menor=0;
        System.out.println("ingrese los numeros");
        for (int i = 0; i < numero.length; i++) {
            numero[i]=TextoScanner.nextInt();
            int num;
            num=numero[0];
            if(num<numero[i]){
                mayor=numero[i];
            }
            if(num>numero[i]){
                menor=numero[i];
            }
            
            if(numero[i]%2==0&&numero[i]!=0){
                System.out.println("el numero es par ");
                
                contador=1+contador;
            }
        }
        System.out.println("la cantidad de pares "+contador);
        System.out.println("el numero mayor es "+mayor);
        System.out.println("el numero menor es "+menor);
    }
    
}
//Escribir un programa que pida 12 números enteros por teclado y que muestre en la pantalla: 
//Cuántos y cuáles de esos números son pares. Cuál es el valor del número máximo. Cuál es el 
//valor del número mínimo.