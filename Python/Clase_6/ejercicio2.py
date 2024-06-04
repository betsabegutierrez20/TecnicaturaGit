'''# En esta clase veremos al sentencia IF/ELSE
condicion = 10
if condicion == True:
    print("Condicion VERDADERA")
elif condicion == False:
    print("Condicion FALSA")
else:
    print("Condicion sin especificar")'''

#Ejercicio: Conversion de numero a texto
num= int(input("Digite un número en el rango del 1 al 3"))
numTexto = " "
if num == 1:
    numTexto = "Número uno"
elif num == 2:
    numTexto ="Número dos"
elif num ==3:
    numTexto ="Número tres"
else:
    numTexto = "Has ingresado un número fuera del rango"
print(f"El número ingresado es: {num} - {numTexto}")
