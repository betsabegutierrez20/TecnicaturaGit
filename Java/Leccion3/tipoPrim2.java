public class tipoPrim2 {
    public static void main(String[] args) {
  
        //Inferencias de tipo (var)
        /*var numEntero = 20; //Las literales sin punto auntomaticamente son tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat =10.0F;  //Atomaticamente con el punto se transforma en tipo double }, PERO para diferenciar ponemos F
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
    
        String miVariableChar = "a" ;
        System.out.println("miVariableChar =" + miVariableChar);
        
        //LAS 3 FORMAS DE INGRESAR UN CARACTER TIPO (CHAR) usando el --> EL CODIGO UNICODE
        char varCaracter = '\u0024';   //Indicamos a Java la asigmnacion con el valor unicode
        System.out.println("varCadena = " + varCaracter);
        char varCaracterDecimal =36;
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';  // un caracter especial , podemos copiar y pegar desde UNICODE
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
    
        var varCaracter1 = '\u0024';   //Indicamos a Java la asigmnacion con el valor unicode
        System.out.println("varCadena1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; // Valor Entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$';  // un caracter especial , podemos copiar y pegar desde UNICODE
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
         
        //para refencial el avalor decimal 
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
    
        int caracterChar = 'b'; // valor de usando la letra b , en valor entero como resultado, desde Unicode
        System.out.println("caracterChar = " + caracterChar);
    }
    
}
