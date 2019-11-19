package bol8_2;

import java.util.Scanner;

/**
 *
 * @author Leila
 */
public class Porcentaje {
    
public String Porcentajes() {

        Scanner leer = new Scanner(System.in);

        int unidades = 0;
        float precioUnitario = 0;
        float porcentaje = 0;

        System.out.println("Escribe las unidades ");
        unidades = leer.nextInt();
        System.out.println("Escribe el precio unitario ");
        precioUnitario = leer.nextFloat();

        if (unidades < 100) {

            return "No tienes descuento";
        }
        if (unidades <= 100 && unidades < 200) {

            if (precioUnitario > 4000) {
                porcentaje = ((precioUnitario * unidades) * 5 / 100);
                return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                        + porcentaje);
            } else {
                porcentaje = ((precioUnitario * unidades) * 2 / 100);
            }
            return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                    + porcentaje);

        }
        if (unidades >= 200) {

            if (precioUnitario > 4000) {
                porcentaje = ((precioUnitario * unidades) * 5 / 100);
                return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                        + porcentaje);
            } else {
                return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                        + ((precioUnitario * unidades) * 2 / 100));
            }
        }
        if (unidades >= 200) {
            porcentaje = ((precioUnitario * unidades) * 10 / 100);
            return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                    + porcentaje);
        } else {
            porcentaje = ((precioUnitario * unidades) * 8 / 100);
        }
        return ("precioUnitario " + precioUnitario + " unidades " + unidades + " precio con descuento "
                + porcentaje);
    }
}

