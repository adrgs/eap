package com.company.oop;

public class Professor extends Person {
    private String courseName;

    public Professor(String name, int age, String courseName) {
        super(name, age);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
