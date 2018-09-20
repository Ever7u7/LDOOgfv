<%-- 
    Document   : Form1
    Created on : 19/09/2018, 07:20:08 PM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <form name="form.jsp" action="Form2Val.jsp" method="POST">
            <label for="n">Nombre(s):</label>
            <input type="text" name="nombre" id="n">
            </br>
            </br>
            <label for="ap">Apellido Paterno:</label>
            <input type="text" name="apellidop" id="ap">
            </br>
            </br>
            <label for="am">Apellido Materno:</label>
            <input type="text" name="apellidom" id="am">
            </br>
            </br>
            <label for="email">Direccion de Correo Electronico:</label>
            <input type="email" placeholder="ejemplo@hola.com" name="email" id="email">
            </br>
            </br>
            <label for="pass">Password:</label>
            <input type="password" name="pass" id="pass">
            </br>
            </br>
            <label for="date">Fecha de Nacimiento:</label>
            <input type="date" name="fechan" id="date">
            <input type="submit" name="submit" value="enviar"/>
        </form>
    </body>
</html>
