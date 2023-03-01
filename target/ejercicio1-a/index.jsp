<%-- 
    Document   : index
<<<<<<< HEAD
    Created on : 1/03/2023, 8:55:19 a. m.
    Author     : zarat
=======
    Created on : 1 mar. 2023, 08:32:00
    Author     : gabma
>>>>>>> 5d767509e6e1449b6efe17ae8b1391a4ca2939e3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor peso</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1><br>Convertidor de peso en diferentes planetas</h1>
        </div>
        <div class="container">
            <p>Este programa te ayuda a saber cual es tu peso en otro planeta. 
            Sabemos que el peso en la tierra es 9.81m/s^2</p>
        </div>
        <div class="container">
            <form action="Return">
                <p id="titulo"><br>Peso en la tierra</p>
                <input type="number" name="peso"><br>
                <p id="titulo"><br>Escoja el planeta</p>
                <div class="planet">
                    <input type="radio" name="planet">Mercurio<br>
                    <input type="radio" name="planet">Venuz<br>
                    <input type="radio" name="planet">Tierra<br>
                    <input type="radio" name="planet">Marte<br>
                    <input type="radio" name="planet">Jupiter<br>
                    <input type="radio" name="planet">Saturno<br>
                    <input type="radio" name="planet">Urano<br>
                    <input type="radio" name="planet">Neptuno<br>
                </div>
                <form action="SvPacientes" method="post"><button type="submit" class="b1"> Enviar </button></form>
            </form>
        </div>
    </body>
</html>
