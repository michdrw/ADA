import java.util.*;

/**
 * Ejercicio01
 */
public class Ejercicio01 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        System.out.println("Ingrese A");
        a = Teclado.nextInt();

        System.out.println("Ingrese B");
        b = Teclado.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            if (a < b) {
                System.out.println(a + " es menor que " + b);
            } else {
                System.out.println(a + " es igual que " + b);
            }

        }

    }

}