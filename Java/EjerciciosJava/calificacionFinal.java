package Java.EjerciciosJava;

import java.util.Scanner;

public class calificacionFinal {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        /*Ejercicio 3: La calificacion final de un estudiante de informática 
        se calcula con base a las calificaciones de cuatro aspectos de su
        rendimiento académico: participación, primer examen parcial, segundo
        examen parcial y examen final. Sabiendo que las calificaciones anteriores
        entran a la calificación final con ponderaciones de 10%, 25%, 25% y 40%, 
        Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante. 
        Que el usuario digite las calificaciones de estos 4 datos y así podremos tener, la calificación final. */
        Scanner entrada = new Scanner(System.in);

        //Lee notas del redimiento academico
        System.out.println("Ingrese la calificación de participación (10%): ");
        double participacion = entrada.nextDouble();

        System.out.println("Ingrese la califición del primer parcial (25%): ");
        double parcial1 = entrada.nextDouble();

        System.out.println("Ingrese la calificion del segundo parcial (25%): ");
        double parcial2 = entrada.nextDouble();

        System.out.println("Ingrese la califición del Examen Final (40%): ");
        double examenFinal = entrada.nextDouble();

        // Calculo de la calificación Final con las ponderaciones
        double calificacionFinal = 0.10 * participacion + 0.25 * parcial1 + 0.25 * parcial2 + 0.40 *examenFinal;
        System.out.println("La Calificación Final del estudiante es: 6" + calificacionFinal);
    }
}

