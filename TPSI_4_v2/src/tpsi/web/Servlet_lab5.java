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

@WebServlet(name = "Servlet_lab5", urlPatterns = {"/lab05"})
public class Servlet_lab5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int licznik = 1;

        HttpSession session = request.getSession();     //utworzenie sesji


        if(session.getAttribute("licz") == null) //Sprawdzamy czy licznik w sesji, ma cokolwiek w sobie
        {
            session.setAttribute("licz", licznik);  //Licznik w sesji ustawiliśmy na wartosc (licznik=1);
            ArrayList<Student> student = new ArrayList<>();     //Inicjalizacja listy
            session.setAttribute("studenci", student); //Ustawiamy ArrayList<Student> student do sesji pod nazwa studenci
        }
        else // licznik w sesji coś w sobie ma
        {
            licznik = (int) session.getAttribute("licz");  //Wartosc licznika z sesji przypisujemy do zmiennej licznik
            licznik++;  // powiekszamy zmienna licznik
            session.setAttribute("licz", licznik); //Ustawiamy licznik w sesji na wartosc zmiennej licznik
        }

        request.getRequestDispatcher("lab05.jsp").forward(request, response);
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
        request.getRequestDispatcher("lab05.jsp").forward(request, response);
    }
}