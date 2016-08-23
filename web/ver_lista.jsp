<%-- 
    Document   : ver_lista
    Created on : 23-ago-2016, 9:09:22
    Author     : fabricio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <body>
        <h1>Lista de animales:</h1>
        <c:forEach items="${lista}" var="animal">
            <h5>${animal.nombre}</h5>
        </c:forEach>
    </body>
</html>
