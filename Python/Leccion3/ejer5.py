#Ejercicio 5: Calcular el factorial de un número mayor que o igual a 0

num= int(input("Digite un  número: "))
if num < 0:
    print("El número debe ser mayor o igual a 0 ")
else:
    factorial = 1
    for i in range(1, num + 1):
        factorial *= i
    print(f"El factorial es: {factorial}")