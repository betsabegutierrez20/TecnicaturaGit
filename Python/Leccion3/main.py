'''#Ciclo while (mientras o durante)
contador = 0
while contador < 3:
    print("Ejecutando nuestro ciclo while", contador)
    contador += 1
else:
     print("Fin del ciclo wthile")'''

#Imprimir número del 0 al 5 con ciclo while
#maximo = 5
#contador = 0
#while contador <= maximo:
 #   print(contador)
#    contador += 

#minimo = 
#contador = 5
#while contador >= minimo:
#    print(contador)
#   contador -= 1'''

#Ciclo for (iterar un arreglo)
#cadena = "Hello"
#for letra in cadena:  #se van compilando de a uno 
#   print(letra)
#else:
#   print("Fin del ciclo for")

#Palabra reservada  (breark)
#for letra in "Alemania": 
#   if letra == "a":
#        print(f"Letra encontrada: {letra}")
#        break # espara rompe el ciclo/estructura al momentod e encontra lo deseado 
#else:
#   print("Fin del ciclo for")'''

#Palabra reservada (continue)
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

for i in range(6):
    if i % 2 != 0:
        continue  # eludiro altaro anular los numeros imapres(en este caso) a la siguiente linea 
    print(f"Valor: {i}")
