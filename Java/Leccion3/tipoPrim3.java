import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.SortingFocusTraversalPolicy;


@SuppressWarnings("unused")
public class tipoPrim3 {
    /**
     * @param args
     */
    @SuppressWarnings({ "resource" })
    
    public static void main(String[] args) {

    //TIPOS PRIMITIVOS: TIPOS BOOLEANOS
    /*var varBool = false;
    System.out.println("varBool = " + varBool);

    if (varBool) { // comparativa
        System.out.println("La bandera es verde ");
    }
    else {
        System.out.println("La badera es roja ");
    }

    //ALGORITMO: ¿Es mayor de edad?
    var edad = 20; //Literal tener presente la inferencia de tipos
    //var adulto = edad >= 18; //Esta es uan expresion boolana
    if (edad >= 18){     //forma de hacerlo mas simplificado 
        System.out.println("Eres mayor de edad");
    }
    else {
        System.out.println("Eres menor de edad");
    }*/

    //CONVERSION DE TIPOS PRIMITIVOS EN JAVA parte1
   /*  var edad = Integer.parseInt("20");   //paso ser  un tipo Entero (int) a un tipo (String)cadena
    System.out.println("edad = " + edad + 1);//conactenacion de como Entero (int) con parentesis y sin como cadena

    var valorPI = Double.parseDouble("3.1416");
    System.out.println("valorPI = " + valorPI); //paso de ser tipo String(double) a Entero  */

    //PEDIR UN VALOR A USUARIO  
    var entrada = new Scanner(System.in); //se usa el scanner, sera el que recibe y guarda la informacion en la variable
    /*System.out.println("Digame su edad: ");
    edad = Integer.parseInt(entrada.nextLine());
    System.out.println("edad = " + edad);*/

    //CONVERSION TIPOS PRIMITIVOS EN JAVA parte 2
    var edadTexto = String.valueOf(20);  // convertir Entero(int) como caracter txt
    System.out.println("edadTexto = " + edadTexto);

    var fraseChar = "programadores".charAt(3); //Muestra solo UN caracter segun la
    System.out.println("fraseChar = " + fraseChar);  //cantidad de caracteres que tenga el comentario
    //ESTO SIRVE ! cuando pedimos datos de la consola 

    System.out.println("Digite un caracter: ");
    fraseChar = entrada.nextLine().charAt(1);      //con el metodo nex.line le asigna un tipo String , pero este es un tipo char
    System.out.println("fraseChar = " + fraseChar);      //para esto usamos el charAt ya que es una cadena , sis e ingresa un numero lo toma como cadena
    //Esto cuando ! cuando perdimos al usuario la frase
}  
}
