package udec.ejercicio1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCalculo", urlPatterns = {"/SvCalculo"})
public class SvCalculo extends HttpServlet {

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
        //int peso = request.getParameter("peso");
        int planeta = Integer.parseInt(request.getParameter("1"));

        System.out.println("El peso es " + peso * planeta);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
