import java.util.*;

/**
 * Ejercicio06
 */
public class Ejercicio06 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        double peso;
        System.out.println("Ingrese peso del paquete en gr: ");
        peso = Teclado.nextDouble();
        
        int zona;
        System.out.println("Ingrese numero de zona de destino del paquete (1-5) : ");
        zona = Teclado.nextInt();

        double costo;
        costo = 0d;

        boolean zonaInexistente = false;


        if (peso <= 5000.00d) {
            switch (zona) {
                case 1 :
                costo = peso * 11;
                break;
                case 2 :
                costo = peso * 10;
                break;
                case 3 :
                costo = peso * 12;
                break;
                case 4 :
                costo = peso * 24;
                break;
                case 5 :
                costo = peso * 27;
                break;
                default :
                zonaInexistente = true;
                break;
            }
        }
        else {
            System.out.println("El paquete no puede ser enviado debido a que excede el peso permitido");
        }

        if (zonaInexistente) {
            System.out.println("Zona inexistente, no se puede realizar envio.");
        }
            else {
            System.out.println("El costo del envio del paquete de " + peso + " gr a la zona " + zona + " sera de " + costo + "$");
            }
    }
}