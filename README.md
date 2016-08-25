# ZOOLOGICO

> Cristian Fabricio Rodriguez Romero
> 20101020078

# INSTALACION

Para la instalacion del proyecto se puede clonar con el comando

```
git clone https://github.com/fab48/zoologico.git
```

o se puede descargar el zip de la opcion ** _clone or download_ **

Este es un proyecto de Netbeans con aplicacion web de JSP, por lo que es necesario tener instalado un servidor local(Apache o GlassFish). Ante cualquier duda de la instalacion de las herramientas seguir el siguiente enlace: https://docs.oracle.com/cd/E19798-01/821-1770/gioew/

# EXPLICACION

Este proyecto muestra la aplicación de los principios SOLID.

![alt tag](https://raw.githubusercontent.com/fab48/zoologico/master/Modelo%20uml.png)

## Principio de responsabilidad única

En el modelo se puede observar la aplicacion de este principio en los diferentes tipos de objetos(Mamifero, Anfibio, Reptil Ave y Pez)

## Principio de abierto/cerrado

En el modelo se puede observer este principio en la extension que se hace de la clase abstracta animal, asi mismo en la extension de los objetos mamifero y ave.

## Principio de segregacion de interface.

En el modelo se puede observar en la division de las interfaces _InterfaceGeneral_ , _InterfaceVertebrado_ y _InterfaceAve_.

## Principio de sustitucion de liskov

En el modelo se puede observar la aplicacion de este principio en la clase _Ave_ y en el codigo en la funcion _alturaVuelo_ de la interface _InterfaceAve_.
