<%-- 
    Document   : Mostrar
    Created on : 10/10/2018, 05:20:20 PM
    Author     : gabri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="styles.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="http://weiweidigital.com/wp-content/uploads/2016/08/fondo-negro.jpg">
        <%
            String nombre = request.getParameter("nombre");
            String apellidoP = request.getParameter("apellidoP");
            String apellidoM = request.getParameter("apellidoM");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String fechaN = request.getParameter("fechaN");
            out.println("<h1>Bienvenido " + nombre + " " + apellidoP + " " + apellidoM);
            out.println("<h1>Email:" + email);
            out.println("<h1>Password:" + pass);
            out.println("<h1>Fecha de Nacimiento:" + fechaN);
            %>
    </body>
</html>
