import java.util.Scanner;
public class ejercicioLibro {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.print("Proporciona el titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = scanner.nextLine();
        System.out.println(titulo +" fue escrito por " + autor);
    }
    
}
