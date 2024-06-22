# Ejercicio 2: Calcular la suam de "N" primeros números
n = int(input("Digite la cantidad de números a sumarse: "))
suma = 0
for i in range (n + 1):
    suma = suma + i
print("La suma es: ", suma)