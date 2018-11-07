

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="styles.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resta</title>
    </head>
    <body background="http://weiweidigital.com/wp-content/uploads/2016/08/fondo-negro.jpg">
        <%
            String Numero1 = request.getParameter("Numero1");
            String Numero2 = request.getParameter("Numero2");
            double Num1 = Double.parseDouble(Numero1);
            double Num2 = Double.parseDouble(Numero2);
            out.println("<h3>"+Numero1 +"-"+Numero2+"="+(Num1-Num2)+"</h1>" );
        %>
        <a href= Calculadora.html> Escoger otra Operacion </a>


    </body>
</html>
