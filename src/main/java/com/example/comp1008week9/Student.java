package com.example.comp1008week9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private int studentNumber;
    private ArrayList<Grade> grades;

    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNumber, ArrayList<Grade> grades) {
        super(firstName, lastName, address, birthday);
        setStudentNumber(studentNumber);
        this.grades = grades;
    }

    /**
     * this second constructor is an "overloaded" constructor. That means there are 2 constructors,
     * but because they have a different set of arguments, the system can differenctiate between
     * them and use the appropriate one
     * @param firstName
     * @param lastName
     * @param address
     * @param birthday
     * @param studentNumber
     */
    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNumber) {
        super(firstName, lastName, address, birthday);
        setStudentNumber(studentNumber);
        this.grades = new ArrayList<>();
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumber >= 100000000 && studentNumber <= 999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Student number has to be between 100000000 - 999999999");
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public String toString()
    {
        return String.format("%d-%s",studentNumber,super.toString());
    }
}
