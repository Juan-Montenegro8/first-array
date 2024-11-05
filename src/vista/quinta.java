package vista;

import java.util.*;

public class quinta {

    public static void main(String[] args) {
        
        Scanner t=new Scanner (System.in);
        int num[]=new int[3];
        Random ale=new Random();
        int prm=0;
        System.out.println("****************************VECTOR 1*********************************");
        for (int i = 0; i < num.length; i++) {
            num[i]=ale.nextInt(11);
            System.out.println("numero"+num[i]);
            prm=num[0]+num[1]+num[2]/3;
        }
        
        int num1[]=new int[3];
        Random ale1=new Random();
        int prm1=0;
        System.out.println("****************************VECTOR 2*********************************");
        for (int i = 0; i < num1.length; i++) {
            num1[i]=ale1.nextInt(11);
            System.out.println("numero"+num1[i]);
            prm1=num[0]+num[1]+num[2]/3;
        }
        
        int num2[]=new int[3];
        Random ale2=new Random();
        int prm2=0;
        System.out.println("****************************VECTOR 3*********************************");
        for (int i = 0; i < num2.length; i++) {
            num2[i]=ale2.nextInt(11);
            System.out.println("numero"+num2[i]);
            prm2=num[0]+num[1]+num[2]/3;
        }
        
        if(prm<=prm1){
            System.out.println("el promedio del vector2 es mayor o igual al vector 1"
                    + "con un promedio de "+prm1);
        }else{
            System.out.println("el promedio del vector2 es menor al vector 1"
                    + "con un promedio de"+prm1);
        }
        
        if(prm<=prm2){
           System.out.println("el promedio del vector3 es mayor o igual al vector 1"
                   + "con un promedio de"+prm2); 
        }else{
            System.out.println("el promedio del vector3 menor al vector 1"
                    + "con un promedio de"+prm2);
        }
    }
    
}
//Hacer un algoritmo que forme un vector del que no se sabe el número de elementos. Calcule el promedio 
//de los elementos y forme dos nuevos arreglos, uno con los elementos menores o iguales al promedio y 
//otro con los superiores, Imprima los dos nuevos vectores.