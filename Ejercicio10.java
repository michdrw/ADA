import java.util.*;

/**
 * Ejercicio10
 */
public class Ejercicio10 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int contadorVocales = 0;
        int contadorEspacios = 0;
        int contadorPuntos = 0;

        char caracter;
        System.out.println("Ingrese oracion caracter por caracter :");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '.') {
            if (esVocal(caracter)) {
                contadorVocales++;
            } else if (caracter == ' ') {
                contadorEspacios++;
            }
            caracter = Teclado.nextLine().charAt(0);
        }
        contadorPuntos++;
        System.out.println("La oracion tiene un total de " + contadorVocales + " vocales, " + contadorEspacios
                + " espacios y " + contadorPuntos + " puntos.");
    }

    static boolean esVocal(char character) {
        switch (character) {
        case 'a':
        case 'A':
        case 'á':
        case 'e':
        case 'E':
        case 'é':
        case 'i':
        case 'I':
        case 'í':
        case 'o':
        case 'O':
        case 'ó':
        case 'u':
        case 'U':
        case 'ú':
            return true;
        }
        return false;
    }

}