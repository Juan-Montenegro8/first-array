package vista;

import java.util.*;

public class quinta {

    public static void main(String[] args) {
        
        int num[]=new int[3];
        Random aleatorio1=new Random();
        int promedio1=0;
        System.out.println("****************************VECTOR 1*********************************");
        for (int i = 0; i < num.length; i++) {
            num[i]=aleatorio1.nextInt(11);
            System.out.println("numero"+num[i]);
            promedio1=num[0]+num[1]+num[2]/3;
        }
        
        int num1[]=new int[3];
        Random ale1=new Random();
        int promedio2=0;
        System.out.println("****************************VECTOR 2*********************************");
        for (int i = 0; i < num1.length; i++) {
            num1[i]=ale1.nextInt(11);
            System.out.println("numero"+num1[i]);
            promedio2=num[0]+num[1]+num[2]/3;
        }
        
        int num2[]=new int[3];
        Random ale2=new Random();
        int promedio3=0;
        System.out.println("****************************VECTOR 3*********************************");
        for (int i = 0; i < num2.length; i++) {
            num2[i]=ale2.nextInt(11);
            System.out.println("numero"+num2[i]);
            promedio3=num[0]+num[1]+num[2]/3;
        }
        
        if(promedio1<=promedio2){
            System.out.println("el promedio del vector2 es mayor o igual al vector 1"
                    + "con un promedio de "+promedio2);
        }else{
            System.out.println("el promedio del vector2 es menor al vector 1"
                    + "con un promedio de"+promedio2);
        }
        
        if(promedio1<=promedio3){
           System.out.println("el promedio del vector3 es mayor o igual al vector 1"
                   + "con un promedio de"+promedio3); 
        }else{
            System.out.println("el promedio del vector3 menor al vector 1"
                    + "con un promedio de"+promedio3);
        }
    }
    
}
//Hacer un algoritmo que forme un vector del que no se sabe el número de elementos. Calcule el promedio 
//de los elementos y forme dos nuevos arreglos, uno con los elementos menores o iguales al promedio y 
//otro con los superiores, Imprima los dos nuevos vectores.