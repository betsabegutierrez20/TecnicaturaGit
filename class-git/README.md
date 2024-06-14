# CLASE 1 MIÉRCOLES 27 DE MARZO DEL 2024

> Lo que vimos en la clase anterior:
<sub
Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, tambien la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios</sub>

```sh
pwd  #Vemos la ruta de la carpeta en la que estamos
cd #Es para navegar a una carpeta: change directory -> cambiar de directorio
cd / #Nos llava al home, en la raíz del disco
cd ~ #La virgulilla significa que estamos en el lugar de los documentos o del usuario
ls #Esto es listar los archivos, nos muestra todos los archivos en la raíz
ls -al #El espacio -al significa que es un argumento especial para ver archivos ocultos
#Usar la flecha hacía arriba nos muestra el último comando utilizado
ls -l #Muestra casi todos los archivos sin los que están ocultos
ls -a #Muestra el grupo de archivos pero no en una lista
clear #Limpia la consola o ctrl + l
cd .. #Nos devuelve a la carpeta anterior
cd U + tab #Esto se usa para un autocompletado o para buscar una referencia
cd /D #Cambiamos de disco en window
df -h #Muestra todos los directorios en Ubuntu
cd /mnt/d #Cambia de directorio usando WSL Ubuntu en window 
```

## AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS

```sh
cd ..
cd ..
cd /mnt/c
cd ~ #Vamos a la raíz
mkdir Tecnicatura #Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux
cd tecnicatura
mkdir Python
mkdir Java
mkdir JavaScript
 ```

<sub
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub
Profesor Ariel Betancud</sub>

# CLASE 4 MIÉRCOLES 17 DE ABRIL DEL 2024

<sub
Analizar cambios en los archivos de tu proyecto Git parte 4 </sub>

<sup 
Ingresamos de la siguiente manera: <sub>
<sub
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

## TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.
```sh
cd tecnicatura

cd class-git

ls

touch historia.txt

code .

#Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido     mi nombre es Ariel (coloca tu nombre)

ctrl + s

git status

git add .

git status

git commit #Sin agregar -m veremos que pasa


#Agregar mensaje y salir con

Esc #Presionamos Escape 

:wq! + enter #Y ya salimos si estamos en git bash con window

Esc + shift + z + z #Salimos del mensaje para el commit, en linux, esto anda en algunas terminales

#Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación

ctrl + s

git add .

git commit

#Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim

Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario

ctrl + x #Para salir en linux

s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux

git show #Vemos todos los cambios en el último commit

git log historia.txt #Vemos todos los commit

q #Para salir del registro de commits

#Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando

git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva

q #Para salir

cd ..

cd ..
```

<sub
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>
<sub
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub
Profesor Ariel Betancud </sub>

 # CLASE 5 MIÉRCOLES 8 DE MAYO DEL 2024


<sup
 Volver en el tiempo en nuestro repositorio utilizando reset y checkout parte 6</sup>
<sub
Ingresamos de la siguiente manera:
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales. </sub>

## TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

```sh
cd tecnicatura

cd class-git

ls

code .

git log #Vemos los commit hechos hasta ahora

Copiar el hash #El número largo que tiene el commit

git reset hash-nombre-commit #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave

git status

git add .

git commit -m "Agregamos datos de estudios en historia.txt"

git config --list #Veremos la configuración que ya hemos hecho con en nombre y email

git reset hash-nombre-commit --hard #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo

git reset hash-nombre-commit --soft #Este es el suave, lo que tengamos en staging segirá allí

crear un archivo #portafolio.html introducir el código y

touch portafolio.html

html : 5 #Con esto se carga el código básico de html y modificamos

ctrl + s #Guardamos

Clic derecho en VSC Open with Live Server para ver en el navegador

git status

ls

ls -al

git add .

git status

git commit -m "Agregamos el html para nuestro portafolio"

creamos CSS #Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css

mkdir css

ls

cd css

touch style.css #creamos un archivo dentro: estilos.css le cargamos el código.

ctrl + s #abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.

git status #tenemos cosas en el área de trabajo, en staging distintas

git diff + enter #y nos muestra los cambios en memoria ram y en disco

git add . #Agregamos todo al staging

git status #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea

git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"

git log #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte

hacer cambios en historia.txt #Cambiamos la última línea y

ctrl + s 

git diff

git commit -am "cambio en la última línea del historia.txt"

git log

q  #Esto para salir

git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits

q #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit

git checkout hash-nombre-commit historia.txt #Veremos el archivo en su estado original

git status #Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando

git checkout master historia.txt #Volvemos a la versión master del archivo historia.txt, esto es muy peligroso

git checkout hash-nombre-commit historia.txt #Volvemos a hacer esto y cambiamos cosas del archivo

git commit -am "Reemplazo de una versión por otra de la historia"

git log #Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master

cd ..

cd ..

```

<sub
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sb>
<sub
Revisar y ejecutar cada comando, hacerlo como practica </sub>
<sub
Profesor Ariel Betancud</sub>




# CLASE 6 MIÉRCOLES 15 DE MAYO DEL 2024

> Git reset vs. Git rm parte 7

<sub
Los comandos git reset y git rm tienen utilidades muy diferentes, pero pueden confundirse fácilmente.</sub>

## GIT RESET

<sub
El comando git reset es una herramienta poderosa que te permite deshacer o revertir cambios en tu repositorio de Git. Lo puedes ejecutar de tres maneras diferentes, con las líneas de commando --soft, --mixed y --hard.
Pero como git checkout que nos deja ir, mirar, pasear y volver. Con git reset volvemos al pasado sin la posibilidad de volver al futuro. Borramos la historia y la debemos sobreescribir. No hay vuelta atrás.
Tres árboles en Git Para entender lo anterior, recordemos que los “tres árboles” de Git son estructuras de datos basadas en nodos y punteros que Git utiliza para hacer seguimiento a un cronograma de ediciones, aunque no sean estructuras en forma de árbol en el sentido tradicional.
La mejor forma de entender estos mecanismos es creando un conjunto de cambios en un repositorio y siguiéndolos a través de los tres árboles. Averigüémoslo.
Ingresamos de la siguiente manera:
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

### TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.


```sh
mkdir git_reset_test #Vamos a hacer pruebas, es por esto que creamos una carpeta nueva

cd git_reset_test #Entramos en la carpeta

git init #Inicializamos el repositorio

touch reset_file.txt

git add reset_file.txt

git commit -m"Iniciando el primer commit"
```


#### ¿Cómo funciona Git Reset en tu flujo de trabajo? 

<sub
Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado y existen variaciones de este comando. </sub>

> Variaciones de Git Reset 
```sh
git reset --soft: #Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit. 

git reset --hard: #Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

git reset --mixed: #Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

git reset HEAD: # El comando git reset saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.
```
<sub
¿Qué es git reset HEAD? </sub>

<sub
git reset HEAD es un comando que te permite revertir los cambios que ya habías preparado para subir, y moverlos de vuelta a tu proyecto. Con este comando puedes cancelar los cambios que ya habías agregado, para que puedas revisarlos, modificarlos o deshacerlos antes de confirmarlos con un commit.
git rm Por otro lado, es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones. Para recuperar el archivo eliminado, necesitamos retroceder en la historia del proyecto, recuperar el último commit y obtener la última confirmación antes de la eliminación del archivo.
Es importante tener en cuenta que git rm no puede usarse sin evaluarlo antes. Debemos usar uno de los flags siguientes para indicarle a Git cómo eliminar los archivos que ya no necesitamos en la última versión del proyecto.</sub>

> Variaciones de Git rm
```sh
git rm --cached: #Elimina archivos del repositorio local y del área de staging, pero los mantiene en el disco duro. Deja de trackear el historial de cambios de estos archivos, por lo que quedan en estado untracked, que significa: que un archivo no está siendo rastreado por Git

git rm --force: #Elimina los archivos de Git y del disco duro. Git guarda todo, por lo que podemos recuperar archivos eliminados si es necesario (empleando comandos avanzados). #¡Al usar git rm lo que haremos será eliminar este archivo completamente de git!
```

##### ¿Cuál es la diferencia entre git rm y git reset Head? 

<sub
La diferencia principal entre git rm y git reset HEAD radica en que git rm elimina archivos del repositorio y de la historia del proyecto, mientras que git reset saca los cambios del área de preparación y los mueve del espacio de trabajo, sin afectar la historia del repositorio.
Es importante tener en cuenta el efecto que cada comando tiene en el proyecto y usarlos según tus necesidades y objetivos específicos.</sub>

###### ¿Cuándo utilizar git reset en lugar de git revert? 

<sub
Para reescribir la historia del repositorio y eliminar confirmaciones anteriores, se utiliza git reset. Para deshacer cambios de confirmaciones anteriores de forma segura sin modificar la historia del repositorio, se emplea git revert.
Resumen Para evitar problemas en el trabajo, es valioso entender las implicaciones y riesgos de cada comando y elegir el enfoque adecuado según las necesidades y el flujo de trabajo del proyecto.
Con git rm eliminamos un archivo de Git, pero mantenemos su historial de cambios. Si no queremos borrar un archivo, sino dejarlo como está y actualizarlo después, no debemos usar este comando en este commit.
Empleando git reset HEAD, movemos los cambios de Staging a Unstaged, pero mantenemos el archivo en el repositorio con los últimos cambios en los que hicimos commit. Así, no perdemos nada relevante.
Siguientes pasos Bueno, todos los cambios están en el área de Staging, incluido el archivo con los cambios que no están listos. Esto significa que debemos sacar ese archivo de Staging para poder hacer commit de todos los demás.
Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos, al finalizar las pruebas, eliminar el directorio con todo su contenido.
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>

<sup
Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor: <sup> 

<sub
Dante Nicolás Martinez</sub>

> Introducción

> Práctica

> PDF

<sub
Revisar y ejecutar cada comando, hacerlo como practica
Profesor Ariel Betancud</sub> 