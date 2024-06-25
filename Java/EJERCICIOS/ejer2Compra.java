package Java.EJERCICIOS;

import java.util.Scanner;

public class ejer2Compra {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        /*Ejercicio 2: En un alamacen se hacen 20 mod descuento a los  clientes
         * cutya compra supere los $100. ¿Cual será la canidad que paragará una persona
         * por su compra?
         */

         Scanner entrada = new Scanner(System.in);
        double compra, descuento, precioFinal;
         System.out.println("Digite la cantidad a pagar: ");
        compra = entrada.nextDouble();

        if (compra > 100 ){
            descuento = compra * 0.20;
            precioFinal = compra - descuento;
        }
        else {
            precioFinal = compra;
        }
        System.out.println("El precio a pagar es: "+ precioFinal);
    }
}
