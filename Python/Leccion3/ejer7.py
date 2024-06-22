#  Ejercicio 7: Dadas las horas trabajadas de 5 personas y la tarifa de pago. 
# Calcular el salario, y la sumatoria  de todos los salarios.
suma = 0
i = 1

while i <= 5:
    horas = int(input(f"Digite las horas trabajadas {i}: "))
    tarifa = float(input (f"Digite la tarifa por hora {i}: "))
    salario = horas * tarifa
    print(f"El salario es {i}: ${salario:.2f}")
    suma += salario
    i += 1
print(f"La suma de todos los salarios es:$ {suma:.2f}")
