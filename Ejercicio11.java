import java.util.*;

/**
 * Ejercicio11
 */
public class Ejercicio11 {

    public static Scanner Teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int [] edades = new int [10];

        for (int i = 0; i < 10; i ++) {
            System.out.println("Ingrese edad #" + i);
            int edad = Teclado.nextLine().charAt(0);
            edades[i] = edad;

        }

        int sumaEdades = 0;
        int promedio = 0;

        for (int i = 0; i < 10; i ++){
        
            sumaEdades += edades[i];
        }
        promedio = sumaEdades / 10;
        System.out.println("El promedio de edades es: " + promedio);
        System.out.println("Edades Recibidas: ");
        
        for (int i = 0; i < 10; i++) {
        System.out.println("Edad " + edades[i]);
        }
    }
}