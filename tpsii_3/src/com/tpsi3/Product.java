package com.tpsi3;
import javax.swing.plaf.ProgressBarUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Product
{
    int id;
    String name, category;
    double price;

    Product(int id, String name, String category, double price)
        {
       this.id = id;
       this.name = name;
       this.category = category;
       this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
