package com.tpsi3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person
{
    private String groupId;
    private List<Double> grades = new ArrayList<>();

    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress );
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    double getGradesAverage()
    {
        double pomoc = 0;

        for(int i=0; i<grades.size(); i++)
        {
            pomoc = pomoc + grades.get(i);
        }

        double wynik = pomoc / grades.size();

        return wynik;
    }
}
