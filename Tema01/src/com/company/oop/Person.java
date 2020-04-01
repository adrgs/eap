package com.company.oop;

import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void checkPersons(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person instanceof Professor) {
                System.out.println(person.getName() + " is a professor of " + ((Professor)person).getCourseName());
            } else if (person instanceof Student) {
                System.out.println(person.getName() + " is a student with grade " + ((Student)person).getGrade());
            } else if (person != null) {
                System.out.println(person.getName() + " is a regular person");
            }
        }
    }

    @Override
    public String toString()
    {
        return "Name: " + this.getName() + " and age: " + this.getAge();
    }
}
