#EJERCICIO : VALOR DENTRO DE RANGO
valor = int(input("Digite un valor dentro del rango (0 al 5): "))
valorMinimo = 0 
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")

else:
    print(f"El valor {valor} NO esta dentro del rango")
