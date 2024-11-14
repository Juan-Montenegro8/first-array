package vista;

import java.util.*;

public class Septima {

    public static void main(String[] args) {
        
        int num[]=new int[10];
        Random ale=new Random();
        int ja,a,b,c,d,e,f,g,h=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=ale.nextInt(11);
            System.out.println("numero"+num[i]);
        }
        ja=num[0]+num[1];
            a=ja+num[2];
            b=a+num[3];
            c=b+num[4];
            d=c+num[5];
            e=d+num[6];
            f=e+num[7];
            g=f+num[8];
            h=g+num[9];
        System.out.println("el resultado es "+h);
    }
    
}
//Cargar un vector de 10 posiciones con los 10 primeros elementos de la serie de Fibonacci y mostrarlo en pantalla.