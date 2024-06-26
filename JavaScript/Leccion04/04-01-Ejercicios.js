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

//Evitar repetir tu codigo
//Dry don+´t reapeat yourself

//let days = ['Lunes', 'Martes', 'Miercoles', 'JUeves', 'Viernes', 'Sabado', 'Domingo'];

let days = 5;
switch (days){
    case 1:
        console.log('Hoy es Lunes');
        break;
    case 2:
        console.log('Hoy es Martes');
        break;
    case 3:
        console.log('Hoy es Miercoles');
        break;
    case 4:
        console.log('Hoy es Jueves');
        break;
    case 5:
        console.log('Hoy es Vienes');
        break;
    case 6:
        console.log('Hoy es Sabado');
        break;
    case 7:
        console.log('Hoy es Domingo');
        break;
    default:
        console.log('Error en el ingreso del dia de la semana')
        break;
}

//Esta es la version mas mejorada, SIMPLIFICACION

let days2 = ['Lunes', 'Martes', 'Miercoles', 'JUeves', 'Viernes', 'Sabado', 'Domingo'];
function getDay(n){
    if (n < 1|| n > 7){ //parametro de tipo entero
        throw new Error('out of range');//si se sale del rango va a decir que se encuentra fuera de rango ERROR
    }
    return days2[n-1]; //si se encuentra dentro del rango va a RETORNAR 
    //n= 0 y  1 es el lunes
}
console.log(getDay(3));

// Hacer un ejercicio similar al que eat hecho, pero ahora con los meses del año, debes hacerlo 
//con la etructura mejorada switch y luego con la funcion en la opcion mejorada,

let month = 11;
switch (month){
    case 1:
        console.log('Es Enero');
        break;
    case 2:
        console.log('Es Febrero');
        break;
    case 3:
        console.log('Es Marzo');
        break;
    case 4:
        console.log('Es Abril');
        break;
    case 5:
        console.log('Es Mayo');
        break;
    case 6:
        console.log('Es Junio');
        break;
    case 7:
        console.log('Es Julio');
        break;
    case 8:
        console.log('Es Agosto');
        break;
    case 9:
        console.log('Es Septiembre');
        break;
    case 10:
        console.log('Es Octubre');
        break;
    case 11:
        console.log('Es Noviembre');
        break;
    case 12:
        console.log('Diciembre');
        break;
    default:
        console.log('Error en el ingreso del mes del año')
        break;
}

//Esta es la opción mejorada

let month2 = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error('out of range'); //clausula de tipo excepción de error, para edeterminar el rango
    }
    return month2[n-1];
}
console.log(getMonth(1));
