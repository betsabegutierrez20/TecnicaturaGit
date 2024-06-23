//Ejercicio para encontrar números pares e impares clase7
let parImpar = 10;
if (parImpar % 2 == 0){
    console.log("Es un número PAR");
}
else {
    console.log("Es un número IMPAR");
}

//Ejercicio: mayor de edad
let edad = 18; adulto = 18;
if ( edad >= adulto){
    console.log("Usted es una persona adulta");
}
else{
    console.log('Usted es una persona menor de edad');
}

//Ejercicio: Dentro del rango clase 8
let dentroRango = 10; //Aqui vamos a ir cambiando el valor por consola
let valMin = 0, valMax = 10;
if( dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido");
}
else {
    console.log("Esta fuera del rango establecido");
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDescanso = false;
if (vacaciones || diaDescanso){
console.log("El padre puede asistir al juego de su hijo")
}
else{
console.log("El padre NO puede asistir al juego de su hijo")
}

//Operador ternario Clase9
let resultado2 = 3 > 2 ? "Verdadero ": "Falso"; //este operado solo se usa para expresione simples de if/else
 console.log(resultado2) 
let numero = 12;
resultado2 = numero % 2 == 0 ? "Es un núero PAR " : "Es un número IMPAR"
console.log(resultado2)

//Convertir String  a Number
let miNumero = "21"; //es una cadena
console.log(typeof miNumero); //para la conversion no denbe tener letras altera la conversion de string a number
let edad2 = Number(miNumero); //esta es uan funcion
console.log(typeof edad2);

//Funcion isNaN: cuando 
if(isNaN(edad2)){ // No es un número=  is not a Numberr (isNaN) (devuelve un resulatdo booleano) 
    console.log("Esta varaible no contiene solo números")
}
else{
    if (edad2 >= 18 ){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}

//Operadror  ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar"
console.log(resultado3);
