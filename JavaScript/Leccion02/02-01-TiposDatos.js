//Tipos de datos en JavaScript
/*
la sintaxis en lo que es com,emtarios 
es muy similar a la de Java
realmente dirigirnos que es identica 
*/
//Tipo STRING
var nombre = "Betsa"; 
console.log(typeof nombre); //con esto se imprime
nombre = 7;           //se puede reutilizar el dato
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);


//Tipo NÚMERICO
var numero = 3000; 
console.log(numero);

//Tipo OBJETO
var objeto = { 
    nombre : "Betsa",
    apellido : "Gutierrez Santos",
    telefono : "2604087740"

}

console.log(objeto);

//Tipo de datos BOOLEAN
var bandera= true;
console.log(typeof bandera);

//Tipo de dato FUNCION
function miFuncion(){};
console.log(typeof miFuncion);

//Tipo de dato SYMBOL
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de datos CLASE
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre; //this hace referencia a los atributos 
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato UNDEFINED (variable no definida)
var x; //cuando NO le asignamos ningun valor |for defaul|se reasigna en undefined
console.log(typeof x);

x= undefined;
console.log(typeof x);

//null: significa ausencia de valor, sin ningun tipo de dato(vacio)
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato ARRAY y Empty String
var autos= ["Citroen","Audi","BMW",'Ford'];
console.log(autos);
console.log(typeof autos); //Preguntamos que tipod e datos es :

var z = ''; 
console.log(z);  //Esto se refiere a que es una cadena vacia:
console.log(typeof z);
