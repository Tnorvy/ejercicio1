package udec.ejercicio1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvCalculo", urlPatterns = {"/SvCalculo"})
public class SvCalculo extends HttpServlet {
    
    private double calculo = 0;
    private String planeta = "a";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int peso = Integer.parseInt(request.getParameter("peso"));
        String mercurio = request.getParameter("1");
        if (mercurio.equals("on")){
            calculo = peso * 3.7;
            planeta = "mercurio";
        }
        String venus = request.getParameter("2");
        if (venus.equals("on")){
            calculo = peso * 8.87;
            planeta = "venus";
        }
        String tierra = request.getParameter("3");
        if (tierra.equals("on")){
            calculo = peso * 9.81;
            planeta = "tierra";
        }
        String marte = request.getParameter("4");
        if (marte.equals("on")){
            calculo = peso * 3.721;
            planeta = "marte";
        }
        String jupiter = request.getParameter("5");
        if (jupiter.equals("on")){
            calculo = peso * 24.79;
            planeta = "jupiter";
        }
        String saturno = request.getParameter("6");
        if (saturno.equals("on")){
            calculo = peso * 10.44;
            planeta = "saturno";
        }
        String urano = request.getParameter("7");
        if (urano.equals("on")){
            calculo = peso * 8.87;
            planeta = "urano";
        }
        String neptuno = request.getParameter("7");
        if (neptuno.equals("on")){
            calculo = peso * 11.15;
            planeta = "neptuno";
        }
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("total", calculo);
        misesion.setAttribute("planeta", planeta);
        response.sendRedirect("verPeso.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
