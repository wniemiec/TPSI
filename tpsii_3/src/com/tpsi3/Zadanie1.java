package com.tpsi3;

import java.util.HashSet;
import java.util.Set;

public class Zadanie1
{
    Set<String> zbiorDni = new HashSet<>();

    Zadanie1()
    {
        zbiorDni.add("Poniedzialek");
        zbiorDni.add("Wtorek");
        zbiorDni.add("Sroda");
        zbiorDni.add("Czwartek");
        zbiorDni.add("Piatek");
        zbiorDni.add("Sobota");
        zbiorDni.add("Niedziela");

        System.out.println("------ ZADANIE 1 ------");

        for(String dzien : zbiorDni) {
            System.out.println(dzien);
        }

    }
    //ODPOWIEDZI NA PYTANIA
    //Roznice takie, ze drzewo sortuje alfabetycznie a hashset po prostu wyswietla nieposortowane oraz hashset jest szybsze
    //Uzyc drzewa, kiedy potrzebujemy posortowane wyniki, natomiast hashset, kiedy nie musimy miec posortowanych
    //Nie
}
