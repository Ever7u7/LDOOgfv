<%-- 
    Document   : Form2Val
    Created on : 20/09/2018, 08:02:29 AM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String nombre = request.getParameter("nombre");
            String apellidop = request.getParameter("apellidop");
            String apellidom = request.getParameter("apellidom");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String fechan = request.getParameter("fechan");
        %>
        <h2>Nombre:</h2> <h3><%=nombre%></h3>
        <h2>Apellido Paterno:</h2> <h3><%=apellidop%></h3>
        <h2>Apellido Materno:</h2> <h3><%=apellidom%></h3>
        <h2>Correo Electronico:</h2> <h3><%=email%></h3>
        <h2>Password:</h2> <h3><%=pass%></h3>
        <h2>Fecha de Nacimiento:</h2> <h3><%=fechan%></h3>
    </body>
</html>
