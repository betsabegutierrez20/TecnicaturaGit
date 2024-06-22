# Ejercicio 4: Supogamos que se tiene un conjunto de calificaciones de un 
# grupo de 10 alumnos.Realizar un algoritmo para calcular la calificacion promedio
# y la calificacion más baja de todo el grupo.
suma = 0 
calificacion = 0
calificacionBaja = 1
for i in range (10): #para i que va desde 1 hasta 10
    calificacion = float(input("Digite unas diez calificaciones: "))
    suma = suma + calificacion #aqui se va a sumar las notas 
    i +=1 #i se va a incrementar en 1 +, a medida que pase 
calificacionPromedio = suma /10 # luego de las suma se / en 10
print("La calificacion promedio es: ", calificacionPromedio)
if calificacion < calificacionBaja:
    calificacionBaja = calificacion
print("La calificacion mas baja es: ", calificacionBaja)

