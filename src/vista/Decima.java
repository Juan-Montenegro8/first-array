package vista;
import java.util.*;
public class Decima {

    public static void main(String[] args) {
        
        Scanner t=new Scanner (System.in);
        int num[]=new int[10];
        Random ale=new Random();
        int o=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=ale.nextInt(11);
            System.out.println("numero "+num[i]);
            if(num[0]<num[i]&&num[i]!=10){
               o=i; 
            }
        }
        System.out.println("la posisicion del numero cuya suma de digitos mas grande es "+o);
    }
    
}
//Leer 10 números enteros, almacenarlos en un vector y determinar en qué posición está el número cuya suma de 
//dígitos sea la mayor.