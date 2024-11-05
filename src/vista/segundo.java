package vista;
import java.util.*;
public class segundo {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int inv[]=new int[15];
        
        System.out.println("ingrese numeros");
        for (int i = 0; i < inv.length; i++) {
            inv[i]=t.nextInt();
        }
        System.out.println("******************la impresion**********************");
        System.out.println(""+inv[14]);
        System.out.println(""+inv[13]);
        System.out.println(""+inv[12]);
        System.out.println(""+inv[11]);
        System.out.println(""+inv[10]);
        System.out.println(""+inv[9]);
        System.out.println(""+inv[8]);
        System.out.println(""+inv[7]);
        System.out.println(""+inv[6]);
        System.out.println(""+inv[5]);
        System.out.println(""+inv[4]);
        System.out.println(""+inv[3]);
        System.out.println(""+inv[2]);
        System.out.println(""+inv[1]);
        System.out.println(""+inv[0]);
        
    }
    
}
//Escribir un programa que lea un vector de 15 elementos y lo imprima invertido.