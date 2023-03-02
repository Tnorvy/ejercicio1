<%-- 
    Document   : verPeso
    Created on : 1 mar. 2023, 10:35:46
    Author     : gabma
--%>

<%@page import="udec.ejercicio1.servlets.SvCalculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor peso</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <script src="script.js" type="text/javascript"></script>
    </head>
    <body onload="iniciar()">
        <div class="container">
            <h1 class="title"><br>Convertidor de peso en diferentes planetas</h1>
        </div>
        <%
            double calculo = Double.parseDouble(request.getParameter("calculo"));
            String planeta = request.getParameter("planeta");
        %>
        <div class="container">
            <p>Tu masa en el planeta <br></p>
        </div>
        <div class="container">
            <h2><%=planeta%></h2>
        </div>
        <div class="container">
            <p>es de <%=calculo%> kilogramos</p>
        </div>

        <div class="container"><form><input type="button" value="Volver" class="b1" onclick="history.back()" /> </form></div>
        <footer>
            <div class="container">
                <canvas id="marco" width="350" height="350" style="background-color: black"></canvas>
            </div> 
        </footer>
    </body>
</html>
