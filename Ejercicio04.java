import java.util.*;

/**
 * Ejercicio04
 */
public class Ejercicio04 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int val_max, pos_val_max;

        val_max = 0;
        pos_val_max = 0;

        for (int i = 1; i <= 15; i++) {
            
            int val;
            val = Teclado.nextInt();

            if (val >= val_max) {
                val_max = val;
                pos_val_max = i;
            }
            else {
            }

        }

        System.out.println ("El valor maximo es: " + val_max);
        System.out.println ("La posicion del valor maximo es: " + pos_val_max);

    }
}