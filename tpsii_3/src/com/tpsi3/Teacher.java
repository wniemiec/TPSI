package com.tpsi3;

import java.util.ArrayList;

public class Teacher extends Person
{
    String courseName;

    public Teacher(String firstName, String lastName, String courseName, String emailAddress)
    {
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
