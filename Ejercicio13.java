import java.util.*;

/**
 * Ejercicio13
 */
public class Ejercicio13 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int contadorVoc = 0;
        int contadorEsp = 0;
        int contadorPun = 0;
        
        String oracion;
        char[] letras;
        
        System.out.println("Ingrese una oración: ");
        oracion = Teclado.nextLine ();
        letras = oracion.toCharArray ();

        
        for (int i = 0; i < letras.length; i++ ){
        if (esVocal (letras[i])) {
            contadorVoc++;
        } else if (letras[i] == ' ') {
            contadorEsp++;
        } else if (letras[i] == '.'){
            contadorPun++;
        } else {
            }
        }
    
    System.out.println("La oracion tiene un total de " + contadorVoc + " vocales, " + contadorEsp
    + " espacios y " + contadorPun + " puntos.");

    } 

    static boolean esVocal(char letra) {
        switch (letra) {
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