import java.util.Scanner;

public class tipoVar2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        /*var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union); 
     
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));   //prioridad de parentesis para la suma de las varaibles 
        //Ejercicio: Caracteristicas Especiales con Java
        var nombre = "Betsa";
        System.out.println("\nNueva linea: \n "+nombre); //Diagonal inversa  y letra n
        System.out.println("Tabulador: \t" + nombre);  // Tabulador(un espacio para centrar) diagonal + t 
        System.out.println("\t\t.: MENU:. "); 
        System.out.println("Retroceso: \b\b"+ nombre); //Caracter de retroceso 
        System.out.println("Comillas simples \'"+ nombre+"\'"); //Comillas simples
        System.out.println("Comillas dobles: \""+ nombre + "\""); //comillas dobles
         */
    
         //Clase Scanner
         Scanner entrada = new Scanner(System.in);  //scanner es un objeto desde la variable entrada
         System.out.println("Digite su nombre: ");
         var usuario2 = entrada.nextLine(); //esto va a leer la informacon que ingrese el usuario
         System.out.println("usuario2 = "+ usuario2);
         System.out.println("Escriba su profesion: ");
         var titulo2 = entrada.nextLine();
         System.out.println("Resultado: "+titulo2+" "+usuario2);
    }
 }
