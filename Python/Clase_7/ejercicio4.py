#EJERCICIO 2: Etapas de vida segun la edad
edad =  int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10: # Sintaxis simplificada
    mensaje = "La infancia es incleible y bella"
elif 10 <= edad < 20:
    mensaje = "Tienes muchos cambios, muchos que estudiar"
elif 20 <= edad < 30:
    mensaje = "Amor y comienza el trabajo :)"
else :
    mensaje = "Error, etapa de vida no reconocida"
print(f"Tu edad es: {edad} años, {mensaje}")
