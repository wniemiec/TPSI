package tpsi.web;

import example.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServletClass extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Jan", "Kowalski", "jkowalski@mail.com"));
        person.add(new Person("Anna", "Nowak", "anowak@mail.com"));
        person.add(new Person("Maciej", "Malinowski","mmalinowski@mail.com"));
        person.add(new Person("Aleksandra", "Jakastam", "ajakastam@mail.com"));
        person.add(new Person("Milena","Milanowska","mmilanowska@mail.com"));

        request.setAttribute("osoby", person);
        request.getRequestDispatcher("personList.jsp").forward(request, response);

    }

}
