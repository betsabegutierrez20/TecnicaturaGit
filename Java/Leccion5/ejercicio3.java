package Java.Leccion5;

import java.util.Scanner;

public class ejercicio3 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        //EJERICIO 3: SISTEMA DE CALIFICACIONES

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número entre 0 y 10: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion <9 ) {
            System.out.println("B");
        }
        else if (calificacion >= 7 && calificacion <8){
            System.out.println("C");
        }
        else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");  
        }
        else if (calificacion >= 0 && calificacion <6 ){
            System.out.println("F");
        }
        else{
            System.out.println("Fuera del rango");
        }
    
    }
}
