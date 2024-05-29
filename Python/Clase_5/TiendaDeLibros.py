#EJERCICIO: TIENDA DE LIBROS
print("Digite los siguientes datos del libro")
nombre = int(input("Digite el nombre del libro: "))
idLibro = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar  si el libro es gartuito True /False")

if envioGratuito == True :
    envioGratuito = True
elif envioGratuito == False:
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False "
print(f'''
        Nombre: {nombre}
        Id: {idLibro}
        Precio: {precio}
        Envio Gratuito: {envioGratuito}
    ''')