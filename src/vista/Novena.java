package vista;

import java.util.*;

public class Novena {

    public static void main(String[] args) {
        
        int num[]=new int[10];
        Random ale=new Random();
        int prm=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=ale.nextInt(11);
            System.out.println("numero "+num[i]);
            prm=num[0]+num[1]+num[2]+num[3]+num[4]+num[5]
                    +num[6]+num[7]+num[8]+num[9]/10;
        }
        System.out.println("el promedio es "+prm);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar si el promedio entero de estos datos 
//está almacenado en el vector.