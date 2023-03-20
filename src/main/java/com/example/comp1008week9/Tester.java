package com.example.comp1008week9;

public class Tester {
    public static void main(String[] args) {
        try {
            Course course = new Course(20021, "COMP 1030", "Programming Fundamentals");
            System.out.println(course);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
