import java.util.*;

/**
 * Ejercicio07
 */
public class Ejercicio07 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {

        int valorServicio;
        valorServicio = 0;

        int cantidadHoras;
        System.out.println("Ingrese la cantidad de horas de servicio");
        cantidadHoras = Teclado.nextInt();

        if (cantidadHoras <= 2) {
            valorServicio = cantidadHoras * 5;
            System.out.println("El valor del servicio por " + cantidadHoras + " horas es de " + valorServicio + " $");
        }
        else {
            valorServicio = 2 * 5;
            if (cantidadHoras <= 5) {
                valorServicio = valorServicio + ((cantidadHoras - 2)*4);
                System.out.println("El valor del servicio por " + cantidadHoras + " horas es de " + valorServicio + " $");
                
            }
            else {
                valorServicio = valorServicio + (3 *4);

                if (cantidadHoras <= 10) {
                    valorServicio = valorServicio + ((cantidadHoras - 5)*3);
                    System.out.println("El valor del servicio por " + cantidadHoras + " horas es de " + valorServicio + " $");
                    

                }
                else {
                    valorServicio = 5*3;
                    valorServicio = valorServicio +
                    ((cantidadHoras - 10)*2);
                    System.out.println("El valor del servicio por " + cantidadHoras + " horas es de " + valorServicio + " $");

                }
            }
        }
    }
}