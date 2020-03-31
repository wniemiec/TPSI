package com.tpsi3;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie3
{
    ArrayList<Product> produkty = new ArrayList<>();
    Map<Integer, Product> mapa = new HashMap<>();
    Map<String, ArrayList<Product>> mapa2 = new HashMap<>();

    Zadanie3()
    {
        System.out.println("------ ZADNIE 3 ------");

        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();

            Product product;

            while(s!=null) {
               // System.out.println(s);
                String[] pola = s.split(";");
                product = new Product(Integer.parseInt(pola[0]), pola[1], pola[2], Double.parseDouble(pola[3]));
                produkty.add(product);
                mapa.put(product.id, product);

                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }


    void wyswietlanie_listy()
    {
        for(int i=0; i<produkty.size(); i++)
        {
            System.out.println(produkty.get(i).name);
        }
    }

    void wyswietlanie_mapy(int id)
    {
        System.out.print(mapa.get(id).id);
    }


    void ostatnie_zad()
    {

        for(Product iterator:produkty)
        {
            if(mapa2.containsKey(iterator.getCategory()))
            {
                mapa2.get(iterator.getCategory()).add(iterator);
            }
            else
            {
                ArrayList<Product> lista = new ArrayList<>();
                lista.add(iterator);
                mapa2.put(iterator.getCategory(), lista);
            }
        }
    }
}
