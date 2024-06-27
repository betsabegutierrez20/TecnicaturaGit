package Java.EjerciciosJava;

import java.util.Scanner;

public class contruirPrograma {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        /*
        Ejercicio 1: Construir un programa que, dado un número total de
        horas, devuelve el número de semanas, días y horas equivalentes.
        Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
        6 días y 16 horas.
        */
    Scanner entrada = new Scanner(System.in);
    int totalHoras, semanas, dias, horas;
    System.out.println("Ingrese la cantidad de horas: ");
    totalHoras = Integer.parseInt(entrada.nextLine());//lee total de horas ingresadas
    
    //conversión de horas ...
    semanas = totalHoras /(24*7);
    dias = totalHoras % (24 * 7)/24;
    horas = totalHoras % 24;

    System.out.println("El total de "+ totalHoras + " horas");
    System.out.println("Se convierte a: ");
    System.out.println(semanas + " semanas");
    System.out.println(dias + " días");
    System.out.println(horas + " horas");
    }
}