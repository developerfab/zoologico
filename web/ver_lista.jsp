<%-- 
    Document   : ver_lista
    Created on : 23-ago-2016, 9:09:22
    Author     : fabricio
--%>

<%@page import="models.ListaAnimales"%>
<%@page import="models.Animal"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1>Lista de animales:</h1>
            <div class="row">
                <%
                    ListaAnimales lista = ListaAnimales.getListaAnimales();
                    for (Animal p: lista.getAnimales()){
                        %>
                        <div class="col-md-4">
                            <h2>Nombre: <%=p.getNombre()%></h2>
                            <h5>Tipo:<%=p.getTipo()%> </h5>
                            <h5>Especie:<%=p.getEspecie()%> </h5>
                            <%
                    } 
                        %>
                        </div>
            </div>
            
        </div>
        
    </body>
</html>
