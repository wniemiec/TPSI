package tpsi.web;

import example.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Servlet", urlPatterns = {"/serv"})
public class Servlet extends HttpServlet {

    static public int licznik = 0;
    ArrayList<Student> student = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession();
        licznik++;
        
        session.setAttribute("licz", licznik);
        session.setAttribute("studenci", student);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String email = request.getParameter("email");
        String id_grupy = request.getParameter("id_grupy");

        HttpSession session = request.getSession();

        ArrayList<Student> zmienna;

        zmienna = (ArrayList<Student>) session.getAttribute("studenci");

        zmienna.add(new Student(imie, nazwisko, email, id_grupy));

        session.setAttribute("studenci", zmienna);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}