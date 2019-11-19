package bol8_1;

import java.util.Scanner;

/**
 *
 * @author Leila
 */
public class Porcentajes {

    public void Porcentajes() {

        Scanner leer = new Scanner(System.in);

        int cantidad;
        int reducido = 0;

        System.out.println("Escribe la cantidad: ");
        cantidad = leer.nextInt();

        if (cantidad < 500) {
            reducido = cantidad * 50 / 100;
            System.out.println("Cantidad = " + cantidad + " Incremento = " + reducido + " Cantidad final = " + (cantidad + reducido));
        } else if (cantidad >= 500 && cantidad <= 1000) {
            reducido = cantidad * 7 / 100;
            System.out.println("Cantidad = " + cantidad + " Incremento = " + reducido + " Cantidad final = " + (cantidad + reducido));
        } else if (cantidad > 1000 && cantidad <= 5000) {
            reducido = cantidad * 15 / 100;
            System.out.println("Cantidad = " + cantidad + " Incremento = " + reducido + " Cantidad final = " + (cantidad + reducido));
        } else {
            reducido = cantidad * 3 / 100;
            System.out.println("Cantidad = " + cantidad + " Incremento = " + reducido + " Cantidad final = " + (cantidad - reducido));
        }
    }
}
