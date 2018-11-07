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


@WebServlet(urlPatterns = {"/Operacion"})
public class Operacion extends HttpServlet {

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
                        String Resultado = request.getParameter ("Operaciones");
            String Numero1 = request.getParameter ("Numero1");
            String Numero2 = request.getParameter ("Numero2");
            
            if(!(Numero1.equals("") || Numero2.equals(""))){
            switch(Resultado){
                case "1" : String Suma =("Suma.jsp?Numero1="+Numero1 +"&Numero2=" + Numero2);
            response.sendRedirect(Suma);
                break;
                case "2" : String Resta =("Resta.jsp?Numero1="+Numero1 +"&Numero2=" + Numero2);
            response.sendRedirect(Resta);
                break;
                case "3" : String Multiplicacion =("Multiplicacion.jsp?Numero1="+Numero1 +"&Numero2=" + Numero2);
            response.sendRedirect(Multiplicacion);
                break;
                
                case "4" : String Division =("Division.jsp?Numero1="+Numero1 +"&Numero2=" + Numero2);
            response.sendRedirect(Division);
                break;
                
            }
            }else{
                out.println("Faltaron Datos");
                 request.getRequestDispatcher("Calculadora.html").include(request, response);
                 
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
