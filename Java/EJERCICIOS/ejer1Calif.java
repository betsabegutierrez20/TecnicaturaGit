package Java.EJERCICIOS;

import java.util.Scanner;

public class ejer1Calif {
    /* Ejercicio 1: Determinar si un alumno aprueba o no un curso, 
     sabiendo que aprobó si su promedio de tres calificaciones es mayor o igual a 70
     reprueba caso contrario.
    */
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        double nota1, nota2, nota3,promedio;

        System.out.println("Digite las 3 calificaiones: ");
        nota1 = Integer.parseInt(entrada.nextLine());
        nota2 = Integer.parseInt(entrada.nextLine());
        nota3 = Integer.parseInt(entrada.nextLine());

        promedio= (nota1 +nota2+nota3)/3;
        if (promedio >= 70){
            System.out.println("El alumno esta aprobado con: "+ promedio);
        }
        else {
            System.out.println("El alumno esta desaprobado con: "+ promedio);
        }
        
    }
}
