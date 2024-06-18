package Java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio6 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float guillermo, luis,juan,total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo /2;
        juan = (luis + guillermo) /2;
        total = luis + guillermo+juan;
        System.out.println("\n El dinero de Luis es: U$$ " + luis);
        System.out.println("El dinero de Juan es: U$$" + juan);
        System.out.println("El total de dinero entre los tres es: u$$ " + total);
    }
}
