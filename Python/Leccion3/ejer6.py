#Ejericio 6: Ingresar "N" enteros , visualizar la suma de los números pares de la lista,
# # cuántos números pares existen y cuál es el promedio de los números impares.

nElementos = int(input("Digite la cantidad de elementos a ingresar: "))
sumaPares= 0
conteoPares= 0
sumaImpares=0
conteoImpares= 0
promedioImpares = 0
i = 1
while i <= nElementos:
    num = int(input("Digite un número: "))
    if num % 2 == 0:
        sumaPares = sumaPares + num
        conteoPares = conteoPares + 1
    else: 
        sumaImpares = sumaImpares + num
        conteoImpares = conteoImpares + 1
    i += 1
if conteoPares == 0:
    print("No se han digitado números pares")
else :
    print(f"La suma de los números pares es: {sumaPares} ")
    print(f"El conteo de los números pares es: {conteoPares}")
if conteoImpares == 0:
    print("No se han digitado numeros impares")
else:
    promedioImpares = sumaImpares/conteoImpares
    print(f"El promedio de impares es: {promedioImpares}") 
