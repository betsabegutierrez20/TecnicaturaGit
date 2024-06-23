//Ejercicio 1: Calcular estacion de l año
let mes= 9;//valor ingresado por codigo duro
let estacion;
if(mes == 1|| mes == 2 || mes== 12){
    estacion = "Verano";
}
else if(mes == 3  || mes ==4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion= "Invierno";
}
else if( mes == 9 || mes == 10 || mes == 11){
    estacion= "Primavera";
}
else{
    estacion= "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: " + estacion);

//Ejericio 2: Hora del dia(a criterio poner a la hora del dia )

/* de 7 a 11= saluda Buenos Dias
de 12 a 14 = Descanso
de 15 a 19 = Hora de estudiar
de 20 a 23 = Clases
de 0 a 6 = Buenas Noches
Trabajamos con el formato de 24 horas 
*/
let horaDia = 22;
let mensaje;
if (horaDia >= 7 && horaDia <= 11){
    mensaje= "Buenos Dias"
}
else if(horaDia >= 12 && horaDia <= 14){
    mensaje= "Descanso"
}
else if (horaDia >= 15 && horaDia <= 19){
    mensaje= "Hora de Estudiar"
}
else if( horaDia >= 20 && horaDia<= 23){
    mensaje= "Hora de Clases"
}
else if(horaDia >= 0 && horaDia <= 6){
    mensaje="Buenas Noches"
}
else {
    mensaje= "Valor incorrecto"
}
console.log(mensaje);

// ESTRCTURA SWITCH (la sintaxis es igual a Java)
switch(mes){  //No solo se puede utilizar números, tambien cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3 : case 4 : case 5:
        estacion= "Otoño";
        break;
    case 6 : case 7 : case 8:
        estacion= "Invierno";
        break;
    case 9 : case 10 : case 11:
        estacion= "Primavera";
        break;
    default: 
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: " + estacion);
/*el switch tiene una comparacion estricta por lo que necesita que sea una de tipo numerico 
y no de cadena. 
*/
// Aplicando el uso de var y let y const
/*
Con var puedes reacignar en cualquier momento
este forma parte del ambito global 
Un errr es que se sobreescribiba
*/ 

var nombre = "Betsa";
nombre = "Daiana";
console.log(nombre);

function saludar(){
    var nombre3 = ("Natalia");
    console.log(nombre3);
}
//console.log(nombr3); //Aqui no lee el dato en la funcion

if(true) {
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la funcion funcionó correctamente, enla estructura if falló

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es el bloque, 
solo disponible dentro de un bloque de llaves
o dentro de una función. 
*/

function saludar2(){
    let nombre2 = "Betsa";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad= 33;
    console.log(edad);
}
//console.log(edad);

/*
const se utiliza para valores constantes que no pueden ser reasignados 
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); // solo se ejecuta en el console anterior