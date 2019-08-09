import java.util.*;

/**
 * Ejercicio05
 */
public class Ejercicio05 {

    public static Scanner Teclado = new Scanner (System.in);

    public static void main(String[] args) {
        double n;
        System.out.println("Ingrese el numero de ventas: ");
        n = Teclado.nextInt();
        //n es numero de ventas

        int a, b, c;
        //a es ventas mayores a 1000, b es ventas menores a 1000 y mayores a 500, c es ventas menores a 500
        a = 0;
        b = 0;
        c = 0;
        
        double t1, t2, t3;
        //t1 es total ventas mayores a 1000, t2 es total ventas menores a 1000 y mayorea a 500, t3 es ventas menores a 500
        t1 = 0;
        t2 = 0;
        t3 = 0;

        double tt;
        //tt es total ventas
        tt = 0;

        double cn;
        //cn es contador de ventas
        cn = 1;

        while(cn <= n) {
            double v;
            System.out.println("Ingrese monto de la venta: ");
            v = Teclado.nextDouble();
            //v es monto de la venta
 
            if (v > 1000) {
                a = a + 1;
                t1 = t1 + v;
            }
            else {
                if (v > 500) {
                    b = b + 1;
                    t2 = t2 + v;
                }
                else {
                    c = c + 1;
                    t3 = t3 + v;
                } 
                
            }
            tt = tt + v;
            cn = cn + 1;
        } 
        System.out.println("Las ventas y el total de las ventas 1 es: " + a + "," + t1);
        System.out.println("Las ventas y el total de las ventas 2 es: " + b + "," + t2);
        System.out.println("Las ventas y el total de las ventas 3 es: " + c + "," + t3);
        System.out.println("El total de las ventas es: " + tt);

       
    }

}