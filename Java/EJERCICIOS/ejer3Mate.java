package Java.EJERCICIOS;

import java.util.Scanner;

public class ejer3Mate {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        /*Ejercicio 3: Leer 2 números; si son iguales que se multipliquen
         * si el pimero es mayor que el segundo que los reste y si no que los sume.
         */
        Scanner entrada= new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Digite dos números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        if (num1 == num2) {
            //si son iguales multiplicamos
            resultado = num1 * num2;
        }
        else {
            //si el primer numero  es mayor los restamos
            if (num1>num2) {
                resultado= num1-num2;
            }
            else{
                resultado = num1 + num2;
            }
        }
        System.out.println("El resultado es: "+ resultado);
    }
}
