package Java.Leccion4;

public class operadores {
        @SuppressWarnings("unused")
        public static void main(String[] args) {
        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma= " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Solucion de la resta= " + solucion);
        
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacin = " + solucion);
    
        solucion = num1 / num2;
        System.out.println("Solucion de la division = " + solucion);
    
        var solucion2 = 3.4D / num2;
        System.out.println("Solucion2 resultado de la division = " + solucion2);
    
        solucion = num1 % num2; //guarfa el residuo de la division
        System.out.println("solucion = " + solucion); //5/4
    
        if (num2 % 2  == 0) // la unica opnion en que podemos eliminar las llaves para un if/else, es cuando solo tenemos una sola linea de codigo
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");
        */
        
        // Practica
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //una operacion
        System.out.println("varNum3 = " + varNum3);
    
        //Operador de COMPOSICION
        varNum1 += 1; //varNum1 = varNmu1 + 1;
        System.out.println("varNum1 = " + varNum1);
    //-=     *= /=   %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
    }
        
}
