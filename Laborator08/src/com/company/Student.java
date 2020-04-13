package com.company;

import java.io.Serializable;

public class Student implements Serializable {
    private String nume;
    private String prenume;
    private int age;
    private int year;

    public Student(String nume, String prenume, int age, int year) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[nume, prenume]: " + nume + " " + prenume + ", [age]: " + age + ", [year]: " + year;
    }
}
