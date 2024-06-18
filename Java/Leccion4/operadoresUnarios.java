package Java.Leccion4;

class operadoresUnarios {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        //OPERADORES UNITARIOS (cambio de signo)
        /*var varA = 7;
        var varB= -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB= " + varB); //El resultado sera un número negativo

        //Operadores de  Negacion
        var varC = true; //esta literal por default en Java es tipo boolean
        var varD = !varC; //aqui esat invrtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD= " + varD);

        //Operadres Unarios de incremento:  Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE= " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF);//va a sumar uno 

        //Posincremento (el simbolo va despues de la variable) 
        var varG = 3; 
        var varH = varG++; //primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores  Unitario de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI= " + varI);//la variable ya esat con decremento
        System.out.println("varJ = " + varJ); 

        //Posdecremento
        var varK = 8;
        var varL = varK--; //primero el valor de la variable , luego queda el decremento
        System.out.println("varK= " + varK); //aqui va a decrementar en 1
        System.out.println("varL = " + varL);

        //mi prueba de 
        var varM = 10;
        System.out.println("varM = " + varM);
        var varN = --varM;
        System.out.println("varN = " +varN);

        //OPERADORES DE IGUALDAD y Relacional (Resultado tipo logico, booleano)
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        //hace comparcion de referencia de objetos (RESULTADO TIPO BOOLEANO)
        var cadenaA = "Hello"; //hace una comparacion de referencias y no de contenido
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        //hace comparacion de contenidos de objetos, son on no iguales
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        //LOS OPERADORES RELACIONALES (idica si un valor es > o =)
        var gVar = aNum != bNum; //>   >=   <    <=     ==     != 
        System.out.println("gNum= " + gVar);
        
                  
        if (aNum % 2 == 0){
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es impar");
        }

        var edad = 13;//ingresado por disco duro
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/

        // OPERADORES CONDICIONALES
        var valorA = 11;
        var valorMinmo = 0; // rango de 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta){
            System.out.println("Esta dentro del rango establecido");
        } else{
            System.out.println("Esta fuera del rango establecido");
        }
        
        //condicional OR
        var vaciones = false;
        var diaLibre= true;
        if (vaciones || diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá NO puede asistir al juego de su hijo");
        }

        //OPERADOR TERNARIO (condicional que toma tres operadores)
        //es una forma corta de escribir una instrucion if/else
        var resultadoT = (5 > 8 ) ? "Verdadero " : "Falso";
        System.out.println("resultado = "+ resultadoT);

             //Ejercicio de par/impar aplicando oper. ternario
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0 ) ? "Es PAR " : "Es IMPAR";
        System.out.println("resultadoT = " + resultadoT);
         
        //PRIORIDAD DE OPERADORES
        var x = 5;  //en inferencia de tipo se evaluan de der a izq 
        var y = 10; //esta es una asignacion
        var z = ++x + y--; //evaluacion de la expresion 
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16

        //ejemplos de prioridades 1
        var solucionAritmetica = 4 + 5 * 6 / 3; //4+((5*6)/3)= 30 /3 = 10 + 4= 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        //ejem 2
        solucionAritmetica = (4 + 5 ) * 6 /3; // 4 +5 = 9 * 6= 54 /3=18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }

}