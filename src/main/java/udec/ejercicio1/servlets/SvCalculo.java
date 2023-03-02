package udec.ejercicio1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvCalculo", urlPatterns = { "/SvCalculo" })
public class SvCalculo extends HttpServlet {

    public double calculo = 0;
    public String planeta = "a";

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
        double peso = Double.parseDouble(request.getParameter("peso"));
        String opcion = request.getParameter("planeta");
        switch (opcion) {
            case "1":
                calculo = peso * 9.81 / 3.7;
                planeta = "mercurio";
                break;
            case "2":
                calculo = peso * 9.81 / 8.87;
                planeta = "venus";
                break;
            case "3":
                calculo = peso * 9.81 / 9.81;
                planeta = "tierra";
                break;
            case "4":
                calculo = peso * 9.81 / 3.721;
                planeta = "marte";
                break;
            case "5":
                calculo = peso * 9.81 / 24.79;
                planeta = "jupiter";
                break;
            case "6":
                calculo = peso * 9.81 / 10.44;
                planeta = "saturno";
                break;
            case "7":
                calculo = peso *  9.81 / 8.87;
                planeta = "urano";
                break;
            case "8":
                calculo = peso *  9.81 / 11.15;
                planeta = "neptuno";
                break;
        }

        calculo = Math.round(calculo * 100) / 100;
        planeta = planeta.toUpperCase();

        request.setAttribute("calculo", calculo);
        request.setAttribute("planeta", planeta);
        response.sendRedirect("verPeso.jsp?calculo=" + calculo + "&planeta=" + planeta);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
