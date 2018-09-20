/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabri
 */
@WebServlet(urlPatterns = {"/SuperServlet"})
public class SuperServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuperServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SuperServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuperServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"#\" method=\"post\">");
            out.println("<label for=\"n\">Nombre(s):</label>");
            out.println("<input type=\"text\" name=\"nombre\" id=\"n\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<label for=\"ap\">Apellido Paterno:</label>");
            out.println("<input type=\"text\" name=\"apellidop\" id=\"ap\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<label for=\"am\">Apellido Materno:</label>");
            out.println("<input type=\"text\" name=\"apellidom\" id=\"am\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<label for=\"email\">Direccion de Correo Electronico:</label>");
            out.println("<input type=\"email\" placeholder=\"ejemplo@hola.com\" name=\"email\" id=\"email\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<label for=\"pass\">Password:</label>");
            out.println("<input type=\"password\" name=\"contraseña\" id=\"pass\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<label for=\"date\">Fecha de Nacimiento:</label>");
            out.println("<input type=\"date\" name=\"fechan\" id=\"date\">");
            out.println("</br>");
            out.println("</br>");
            out.println("<input type=\"submit\" name=\"submit\" value=\"enviar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try (PrintWriter out = response.getWriter()) {
                    String nombre = request.getParameter("nombre");
                    String apellidop = request.getParameter("apellidop");
                    String apellidom = request.getParameter("apellidom");
                    String email = request.getParameter("email");
                    String contraseña = request.getParameter("contraseña");
                    String fechan = request.getParameter("fechan");
                    out.println(nombre);
                    out.println(apellidop);
                    out.println(apellidom);
                    out.println(email);
                    out.println(contraseña);
                    out.println(fechan);
                    
                    
                }
        //doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
