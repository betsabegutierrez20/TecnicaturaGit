#Ejercicio 3: Leer 10 números e imprimir cuantos son positivos, cuantos
# negativos y cuantos neutros. 

conteoPositivo = 0
conteoNegativo = 0
conteoNeutro = 0
for i in range(10):
    num = int(input("Digite diez números: "))
    if num == 0:
        conteoNeutro = conteoNeutro + 1
    elif num > 0:
        conteoPositivo = conteoPositivo + 1
    elif num < 0:
        conteoNegativo = conteoNegativo + 1
        i = i + 1
print("La cantidad de numeros positivos es: ", conteoPositivo)
print("La cantidad de números negativos es: ", conteoNegativo)
print("La cantidad de números neutros es: ", conteoNeutro)
