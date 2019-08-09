import java.util.*;

public class Ejercicio00 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args){
        int a;
        System.out.println("Ingrese 1er Num");
        a = Teclado.nextInt();
        
        int b;
        System.out.println("Ingrese 2do Num");
        b = Teclado.nextInt();
        
        int c;
        c = a * b;
        System.out.println("El resultado es: " + c);
    }


}
    
    
   