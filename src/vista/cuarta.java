package vista;
import java.util.*;
import java.util.Scanner;

public class cuarta {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int numeros[]= new int[20];
        Random aleatorio = new Random();
        System.out.println("escribe el numero");
        int num;
        num=t.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= aleatorio.nextInt(11);
            System.out.println("posicion "+i+" numero "+numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            if(num==numeros[i]){
                System.out.println("el numero que elegiste esta");
            }else{
                System.out.println("el numero que elegiste no esta");
            }
        }

    }
    
}
//Escribir un programa que lea 20 números y luego reciba uno más y diga si se encuentra en el vector,
//mostrando las posiciones.