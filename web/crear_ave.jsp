<%-- 
    Document   : crear_ave
    Created on : 23-ago-2016, 18:44:34
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Ave</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container text-center">
            <h1>Crear Ave</h1>
            <form action="./AveController" method="post">
                <label>Nombre:</label>
                <input id="nombre" name="nombre" type="text" placeholder="pajarito"/><br/><br/>
                <select id="tipo" name="tipo">
                    <option value="copeton">Copeton</option>
                    <option value="pinguino">Pinguino</option>
                </select><br/><br/>
                <button class="btn btn-success" type="submit">Crear</button>
            </form>
        </div>
        
    </body>
</html>
