/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "JurosCompostoServlet", urlPatterns = {"/juros-composto.html"})
public class JurosCompostoServlet extends HttpServlet {

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
             String Cap = request.getParameter("value2");
           int c = Integer.parseInt(Cap);
           
           String Jr = request.getParameter("porcent2");
           float j = Integer.parseInt(Jr);
           
            String Dt = request.getParameter("date2");
           int D = Integer.parseInt(Dt);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Juros Compostos</title>"); 
            out.println("</head>");
            out.println("<body>"); 
            
            DecimalFormat deci = new DecimalFormat("0.00");
            
            double F = 1 +(j /100);
            double M = Math.pow(F, D);
            double Vf = c * M;
            double Vg = Vf - c;
           
            out.println("Capital Inicial: R$");
            out.println(deci.format(c));  
            out.println("<br>");
            
            out.println("Juros: ");
            out.println(deci.format(j));
            out.println("%");
            
            out.println("<br>");
            
            out.println("Meses: ");
            out.println(D);
            out.println("<br><br>");
           
            out.println("Valor Ganho: R$");
            out.println(deci.format(Vg));
            out.println("<br>");
            
            out.println("Valor  futuro: R$");
            out.println(deci.format(Vf));
            
            out.println("</body>");
            out.println("</html><br><br>");
            
            out.println("<a href='page2.jsp'>Voltar</a>");
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
