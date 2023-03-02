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
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor peso</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1 class="title"><br>Convertidor de peso en diferentes planetas</h1>
        </div>
        <div class="container">
            <p>Este programa te ayuda a saber cual es tu peso en cualquiera de los planetas del sistemas solar</p>
        </div>
        <div class="container">
            <form action="SvCalculo" method="POST">
                <div id="table">
                    <p id="titulo"><br>Masa en kilogramos:</p>
                    <input type="number" name="peso" step="0.01" placeholder="Ej. 55.61"><br>
                    <p id="titulo"><br>Escoja el planeta
                    <div class="planet">
                        <input type="radio" name="planeta" value="1" required>Mercurio<br>
                        <input type="radio" name="planeta" value="2" required>Venus<br>
                        <input type="radio" name="planeta" value="3" required>Tierra<br>
                        <input type="radio" name="planeta" value="4" required>Marte<br>
                        <input type="radio" name="planeta" value="5" required>Jupiter<br>
                        <input type="radio" name="planeta" value="6" required>Saturno<br>
                        <input type="radio" name="planeta" value="7" required>Urano<br>
                        <input type="radio" name="planeta" value="8" required>Neptuno<br>
                    </div>
                    </p>
                    <button type="submit" class="b1"> Calcular </button></form>
        </div>
    </form>
</div>
</body>
</html>
