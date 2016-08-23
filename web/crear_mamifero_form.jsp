<%-- 
    Document   : crear_animal_form
    Created on : 23-ago-2016, 7:10:31
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear mamifero</title>
    </head>
    <body>
        <h1>Crear mamifero</h1>
        <form action="./MamiferoController" method="post">
            <label>Nombre:</label>
            <input id="nombre" name="nombre" type="text"/>
            <select id="tipo" name="tipo">
                <option value="ballena">Ballena</option>
                <option value="gato">Gato</option>
                <option value="perro">Perro</option>
            </select>
            <button type="submit">Crear</button>
        </form>
    </body>
</html>
