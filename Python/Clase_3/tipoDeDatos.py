# Clase 3 TIPOS DE DATOS
# TYPE STRING
a: str = "Hola Alumnos"
print(type(a)) #esta "type" muestar el tipo de variable es ,este caso es str(tipo cadena) que se usa como REFERENCIA

# TYPE FLOAT AND INT
b = 10
print(type(b)) # el type "int" es hace referencia a un tipo ENTERO, y el "FLOAT" 

# TYPE BOOLEAN 
a = True
print(type(a))

# RESUME TYPES int, float, string, boo
x = 10 
print(x)
print(type(x))
x = 14.5 
print(x)
print(type(x))
x = "HELLO, MY STUDENTS"
print(x)
print(type(x))
x = True
print(type(x))
x = False 
print(type(x))

# MANEJO DE CADENAS (String)
miGrupoFavorito = "Beethoven"
caracteristicas = "The best classical  music"
print("Mi grupo favorito es: ",  miGrupoFavorito, caracteristicas)  # el simbolo + se usa como concatenación y declarar la variable

# caso numerico
numero1 = "8"               # son tipo cadena, osea palabras  las que estan en ""
numero2 = "2"               # para sumar podemos  colocarlo entre parentesis con la palabra int(entero) 
print(int(numero1)+int(numero2))         # pero si hay letras dentro no se puede

# Tipos Boolean (boo)
miBooleano = 3 > 2        # solo se ejecuta True o False
print(miBooleano)

if miBooleano:    #Condicional
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario AQUI SE INGRESA LA INFO DEL USUARIO

# Funcion "input" (el que recibe la informacion ingresada)
#(aqui hace la entrada y salida de informacion )
# mensaje, cadena regrear un dato tipo string


#resultado = input("Digite unn número: ") 
#print(resultado)

#Conversion de la entrada de datos(input recibe DATOS TIPO CADENA)
numero1 = input("Escribe el primer número: ")
numero2 = input("Escribe el segundo número: ")
resultado = int(numero1)+ int(numero2)           # tranformar el dato string a dato int(entero)
print("El resultado de la suma es: ", resultado)