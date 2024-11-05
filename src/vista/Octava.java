
package vista;

import java.util.Random;
import java.util.Scanner;

public class Octava {

    public static void main(String[] args) {
        
        Scanner t=new Scanner (System.in);
        int num[]=new int[10];
        Random ale=new Random();
        int nu=0,n;
        for (int i = 1; i < num.length; i++) {
            num[i]=ale.nextInt(11);
            System.out.println("los numero son "+num[i]);
            n=num[0]=10;
            if(n<=num[i]){
                nu=1+nu;
            }
        }
        System.out.println("las veces que se repite el mayor es "+nu);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el mayor.