package Java.Leccion5;

public class if_else {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //SENTENCIA DE CONTROL IF/ELSE
        var condicional = false;
        if (condicional){
            System.out.println("Condición Verdadera");//condicional simple
        } else{
            System.out.println("Condición Falsa");//condicional doble
        }

        var numero = 4;
        var numeroTexto = "Número desconocido";
        if(numero == 1){
            numeroTexto = "Número uno";
        }
        else if (numero == 2){
            numeroTexto = "Número dos";
        }
        else if (numero == 3){
            numeroTexto= "Número tres";
        } 
        else if (numero== 4){
            numeroTexto = "Número cuatro";
        } 
        else {
            numeroTexto= "Número no encontrado";
        }System.out.println("númeroTexto = " + numeroTexto);

        //SENTENCIA DE CONTROL SWITCH
        var num = 2;
        var numTexto = "Valor desconocido";
        switch (num) {
            case 1:
                numTexto = "Número uno";
                break;
            case 2:
                numTexto = "Numero dos";
                break;
            default :
                break;
        }
    }
}
