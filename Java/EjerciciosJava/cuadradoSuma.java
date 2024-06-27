package Java.EjerciciosJava;

import java.util.Scanner;

public class cuadradoSuma {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Ejercicio 2: Hacer un programa que calcule el cuadro de una suma, 
        el usuario debe ingresar el valor de a y el valor de b.
        Formula: (a+b)2=a2+b2+2*a*b
        Para esto deberán utilizar la clase Math y un método llamado pow. */

        System.out.println("Ingrese el valor de a: ");
        double a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = entrada.nextDouble();

        //formula 
        double suma = a + b;
        double cuadradoSuma = Math.pow(suma, 2); //aqui lo que va hacer es tomar la suma de a y b y elevarlo al cuadrado(2)

        System.out.println("El cuadrado de la suma de " + a + " y " + b + " es: "+ cuadradoSuma);
    }
}
