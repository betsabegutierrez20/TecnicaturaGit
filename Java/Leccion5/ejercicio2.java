package Java.Leccion5;

import java.util.Scanner;

public class ejercicio2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //EJERCICIO 2: CALCULO DE LAS ESTACIONES DEL AÑO CON SWICTH

        Scanner entrada = new Scanner(System.in );
        System.out.println("Digite un número de mes: ");
        var mes = Integer.parseInt(entrada.nextLine()); //se sonvierte a tipo entero
        var estacion = "Estacion desconocida";
        switch (mes) {
            case 1: case 2:  case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
