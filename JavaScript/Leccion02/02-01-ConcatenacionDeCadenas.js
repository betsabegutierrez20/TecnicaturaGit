var nombre = "José";
var apellido = " Luis";
var nombreCompleto = nombre+ ' ' + apellido;  //Primera conacatenación
console.log(nombreCompleto);

var nombreCompleto2 = "Betsabé"+ ' '+'Gutierrez';  // Segunda concatenación
console.log(nombreCompleto2);

var juntos = nombre + 219;   //Lee de izq a der siguiendo la cadena lee el numero como stc
console.log(juntos);
juntos = nombre + (78 + 17);// Aqui se puede diferencia r a través de los paréntesis
console.log(juntos);
juntos =  78 + 17 +nombre; 
console.log(juntos);

nombre += apellido;  //Tercera concatenación usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const(es de buena practica usar el identificador)
let nombre2= "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Perez"; una constante NO puede ser MOIFICADA(como el dni, la fecha de nacimiento)
console.log(apellido2);

let x,y; //Se puede crear variables dentro de una maisma línea
x = 17, y = 21; //Se puede hacer asignación de varias variables dentro de la misma variables de la misma línea
let z= x + y;   //Se asigna el valor de la operación
console.log(z);

let _1num = 31; //no se puede con numeros al iniciar el nombre.variable 
let rompiendo = "Rompe"; //no se pueden utilizar palabras reservadas para variables

console.log(_1num);
console.log(rompiendo);
