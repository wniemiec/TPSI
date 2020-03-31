package com.tpsi3;
import java.util.*;

public class Zadanie2
{
    Map<String, Teacher> przedmioty = new HashMap<>();
    Map<Integer, ArrayList<Student>> grupy = new HashMap<>();

    Zadanie2()
    {

        przedmioty.put("Programowanie strukturalne", new Teacher("Anna", "Nowak", "Programowanie strukturalne", "a.nowak@mail.com"));
        przedmioty.put("Programowanie obiektowe", new Teacher("Jan", "Kowalski", "Programowanie Obiektowe", "j.kowalski@mail.com"));
        przedmioty.put("Grafika", new Teacher("Artur", "Jakistam", "Grafika", "a.jakistam@mail.com"));

        System.out.println("------ ZADANIE 2 ------");

        Teacher p = przedmioty.get("Programowanie obiektowe");
        System.out.println("Nauczyciel: " + p.getFirstName() + " " + p.getLastName() + " " + p.getCourseName() + " " + p.getEmailAddress());


        ArrayList<Student> grupa30 = new ArrayList<>();
        grupa30.add(new Student("Milosz", "Jakis", "m.jakis2mail.com", "301"));
        grupa30.add(new Student("Karol", "Nowak","k.nowak@mail.com","302"));
        grupa30.add(new Student("Ola", "Kwiatkowska", "o.kwiatkowska@mail.com", "303"));


        ArrayList<Student> grupa31 = new ArrayList<>();
        grupa31.add(new Student("Filip", "Wert","f.wert@mail.com","311"));
        grupa31.add(new Student("Alicja", "Feren","a.feren@mail.com", "312"));
        grupa31.add(new Student("Kinga","Zxc","k.zxc@mail.com","313"));

        ArrayList<Student> grupa32 = new ArrayList<>();
        grupa32.add(new Student("Julia", "Jukl","j.jukl@mail.com","321"));
        grupa32.add(new Student("Adam","Tyu","a.tyu@mail.com","322"));
        grupa32.add(new Student("Maciek","Mafs","m.mafs@gmail.com","323"));

        grupy.put(30, grupa30);
        grupy.put(31, grupa31);
        grupy.put(32, grupa32);

        System.out.println("Uczniowie grupy 32");

        for(Student klucz:grupy.get(32))
        {
            System.out.println(klucz.getFirstName() + " " + klucz.getLastName() + " " + klucz.getEmailAddress() + " " + klucz.getGroupId());
        }
}

}
