#Ejercicio calcular la estacion del año
mes = int(input("Digite un mes del año ( 1 -12): "))
estacion = None
if mes == 1  or mes == 2 or mes == 3:
    estacion = "VERANO"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "OTOÑO"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "INVIERNO"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "PRIMAVERA"
else: 
    estacion = "Error, no hay número para ese mes "
print(f"Para el mes {mes} la estación es: {estacion} ") 