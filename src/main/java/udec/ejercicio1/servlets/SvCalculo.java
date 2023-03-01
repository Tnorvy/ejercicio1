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
        String mercurio = request.getParameter("1");
        if (mercurio.equals("on")){
            System.out.println("El peso es " + peso * 3.7);
        }
        String venus = request.getParameter("2");
        if (venus.equals("on")){
            System.out.println("El peso es " + peso * 8.87);
        }
        String tierra = request.getParameter("3");
        if (tierra.equals("on")){
            System.out.println("El peso es " + peso * 9.81);
        }
        String marte = request.getParameter("4");
        if (marte.equals("on")){
            System.out.println("El peso es " + peso * 3.721);
        }
        String jupiter = request.getParameter("5");
        if (jupiter.equals("on")){
            System.out.println("El peso es " + peso * 24.79);
        }
        String saturno = request.getParameter("6");
        if (saturno.equals("on")){
            System.out.println("El peso es " + peso * 10.44);
        }
        String urano = request.getParameter("7");
        if (urano.equals("on")){
            System.out.println("El peso es " + peso * 8.87);
        }
        String neptuno = request.getParameter("7");
        if (neptuno.equals("on")){
            System.out.println("El peso es " + peso * 11.15);
        }   
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
