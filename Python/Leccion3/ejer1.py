# Ejercicio: Año bisiesto
print("Comprobamos que año es bisiesto")
num = int(input("Ingrese el año: "))
opcion = 0
while opcion != 1:
    opcion= int(input("Para seguir adelante digite la opción 1: "))
if ((num % 4 == 0) and (num % 100 != 0) or (num % 400 == 0)):
    print("El año es bisiesto")
else:
    print("El año NO es bisiesto: ")

