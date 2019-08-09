import java.util.*;

/**
 * Ejercicio09
 */
public class Ejercicio09 {

    public static Scanner Teclado = new Scanner(System.in);

    public static boolean esBisiesto(int anio) {

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {

        int anio;
        System.out.println("Ingrese año");
        anio = Teclado.nextInt();

        if (esBisiesto(anio) == true) {
            System.out.println("Este año es bisiesto");
        } else {
            System.out.println("Este año es bisiesto");
        }
    }
}