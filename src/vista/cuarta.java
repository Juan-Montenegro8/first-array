package vista;
import java.util.*;

public class cuarta {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner (System.in)) {
            int numeros[]= new int[20];
            Random aleatorio = new Random();
            int encontrado =0;
            System.out.println("escribe el numero");
            int encontrar=textoScanner.nextInt();
            for (int i = 0; i < numeros.length; i++) {
                numeros[i]= aleatorio.nextInt(11);
                System.out.println("posicion "+i+" numero "+numeros[i]);
            }
            for (int i = 0; i < numeros.length; i++) {
                if(encontrar==numeros[i]){
                    System.out.println("el numero que elegiste esta en la posicion "+i);
                    encontrado =1;
                }
            }
            if (encontrado==1) {
                System.out.println("El numero que elegiste no se encunetra en los otros numeros");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
        
    }
    
}
//Escribir un programa que lea 20 números y luego reciba uno más y diga si se encuentra en el vector,
//mostrando las posiciones.