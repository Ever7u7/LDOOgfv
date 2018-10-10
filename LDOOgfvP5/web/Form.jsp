<%-- 
    Document   : Form
    Created on : 10/10/2018, 04:48:05 PM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="styles.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body background="http://weiweidigital.com/wp-content/uploads/2016/08/fondo-negro.jpg">
        <form name="form.jsp" action="SevletValidar" method="POST">
            <label for="n">Nombre(s):</label>
            <input type="text" name="nombre" id="n">
            </br>
            </br>
            <label for="ap">Apellido Paterno:</label>
            <input type="text" name="apellidoP" id="ap">
            </br>
            </br>
            <label for="am">Apellido Materno:</label>
            <input type="text" name="apellidoM" id="am">
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
            <input type="date" name="fechaN" id="date">
            <input type="submit" name="submit" value="enviar"/>
        </form>
    </body>
</html>

