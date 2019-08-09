import java.util.*;

/**
 * Ejercicio08
 */
public class Ejercicio08 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {
        
        int calificacion;
        System.out.println("Ingrese calificacion (0-10): ");
        calificacion = Teclado.nextInt();

        boolean calificacionInvalida = false;

        switch (calificacion) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            System.out.println("La calificacion es: F" );
            break;
            case 6 :
            case 7 :
            System.out.println("La calificacion es: D" );
            break;
            case 8 :
            System.out.println("La calificacion es: C" );
            break;
            case 9 :
            System.out.println("La calificacion es: B" );
            break;
            case 10 :
            System.out.println("La calificacion es: B" );
            break;
            default :
            calificacionInvalida = true;
            System.out.println("Calificacion no valida" );
            break;
        }
    }
}