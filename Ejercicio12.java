import java.util.*;

/**
 * Ejercicio12
 */
public class Ejercicio12 {

    public static Scanner Teclado = new Scanner (System.in);

    public static void main(String[] args) {
        
        int [] sumatoria = new int [7];
        int [] arreglo1 = new int [7];
        int [] arreglo2 = new int [7];

        
        
        for (int i = 0; i < 7; i ++) {

            System.out.println("Ingrese la posicion #" + i + " del arreglo 1");
            arreglo1 [i] = Teclado.nextInt();
            
        }
        
        for (int i = 0; i < 7; i ++) {
        System.out.println("Ingrese la posicion #" + i + " del arreglo 2");
            arreglo2 [i] = Teclado.nextInt();

        }

        for (int i = 0; i < 7; i ++) {
            
            sumatoria[i] = arreglo1[i] + arreglo2 [i];
            System.out.println("La sumatoria de ambos conjuntos es " + sumatoria[i]);
        
        }
    }
}