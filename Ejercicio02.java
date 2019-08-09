import java.util.*;

/**
 * Ejercicio02
 */
public class Ejercicio02 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int sueldo_bajo, sueldo_medio, sueldo_alto, burguesia;

        sueldo_bajo = 0;
        sueldo_medio = 0;
        sueldo_alto = 0;
        burguesia = 0;
        
        System.out.println("Ingresar sueldos0: ");
        int sueldo; 
        sueldo = Teclado.nextInt();

        while (sueldo != 0) {
            if (sueldo < 520) {
                sueldo_bajo = sueldo_bajo + 1;
            }
            else {
                if (sueldo > 520 && sueldo < 780) {
                    sueldo_medio = sueldo_medio + 1;
                }
                else {
                    if (sueldo > 780 && sueldo < 999) {
                        sueldo_alto = sueldo_alto + 1;
                    }
                    else {
                        burguesia = burguesia + 1;
                    }
                    
                }
            }
            sueldo = Teclado.nextInt();
        }

        System.out.println("La cantidad de sueldos bajos es: " + sueldo_bajo);
        System.out.println("La cantidad de sueldos medios es: " + sueldo_medio);
        System.out.println("La cantidad de sueldos altos es: " + sueldo_alto);
        System.out.println("La cantidad de burgueses es: " + burguesia);

    }
}
