package Java.Leccion4;

public class rectangulo {
    public static void main(String[] args) {
        //EJERCICIO 1:
        // Definir las variables para la base y la altura
        int base = 10; // por ejemplo, 10 unidades
        int  altura = 5; // por ejemplo, 5 unidades

        // Calcular el área
        int area = base * altura;
        
        // Calcular el perímetro
        int perimetro = 2 * (base + altura);

        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}