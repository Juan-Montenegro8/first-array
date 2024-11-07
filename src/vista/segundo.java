package vista;
import java.util.*;
public class segundo {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int invertido[]=new int[15];
        
        System.out.println("ingrese numeros");
        for (int i = 0; i < invertido.length; i++) {
            invertido[i]=t.nextInt();
        }
        System.out.println("******************la impresion**********************");
        for (int i = 0; i < invertido.length; i++) {
            System.out.println(""+invertido[i]);
        }
        
    }
    
}
//Escribir un programa que lea un vector de 15 elementos y lo imprima invertido.