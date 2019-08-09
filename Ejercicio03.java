import java.util.*;

/**
 * Ejercicio03
 */
public class Ejercicio03 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a, b, c, d;
        double f;

        System.out.println("Ingrese 1er valor");
        a = Teclado.nextInt();

        System.out.println("Ingrese 2do valor");
        b = Teclado.nextInt();

        System.out.println("Ingrese 3er valor");
        c = Teclado.nextInt();

        d = a + b + c;

        f = d / 3;

        System.out.println("El promedio es: " + f);
    }
}