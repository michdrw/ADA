import java.util.*;

/**
 * Ejercicio14
 */
public class Ejercicio14 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int sumatoria = new int [n];
        int n;
        n = Teclado.nextInt();
        int [] arreglo = new int [n];
        //los elementos que van a ser sumados 

        boolean hay13 = false; 
        for (int i = 0; i < n; i++){
            if (arreglo == 13) {
                hay13 = true;}
                else {
                    if (!hay13) {
                        sumatoria = sumatoria + arreglo[i];
                        System.out.println("La sumatoria del array es: " + sumatoria );
                    } else {
                        hay13 = false;
                    }
                }
        } 
        }
    

        

    }