package vista;


public class Septima {

    public static void main(String[] args) {
        int[] fibonacci = new int[10];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Los primeros 10 elementos de la serie de Fibonacci son:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("Posición " + i + ": " + fibonacci[i]);
        }
    }
    
}
//Cargar un vector de 10 posiciones con los 10 primeros elementos de la serie de Fibonacci y mostrarlo en pantalla.