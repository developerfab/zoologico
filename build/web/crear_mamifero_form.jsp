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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container text-center">
            <% if(request.getAttribute("message") != null){
                %><h1><%=request.getAttribute("message")%></h1>
                <%
            } %>
            <h1>Crear mamifero</h1>
            <form class="form-group" action="./MamiferoController" method="post">
                <label>Nombre:</label>
                <input id="nombre" name="nombre" type="text" placeholder="Juanito"/><br/><br/>
                <label>Tipo de animal:</label>
                <select id="tipo" name="tipo">
                    <option value="ballena">Ballena</option>
                    <option value="gato">Gato</option>
                    <option value="perro">Perro</option>
                </select><br/><br/>
                <button class="btn btn-success" type="submit">Crear</button>
            </form>
        </div>
        
    </body>
</html>
