<%-- 
    Document   : verPeso
    Created on : 1 mar. 2023, 10:35:46
    Author     : gabma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor peso</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1><br>Convertidor de peso en diferentes planetas</h1>
        </div>
        <% String mundo = misesion.getAttribute("planeta");
        double calculo = misesion.getAttribute("total");%>
        <div class="container">
            <p>Tu peso en el planeta <%=mundo%> es:</p>
        </div>
        
        <div class="container"><form><input type="button" value="Volver" class="b1" onclick="history.back()" /> </form></div>
    </body>
</html>
