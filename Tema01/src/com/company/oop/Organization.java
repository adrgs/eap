package com.company.oop;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private String name;
    private List<Person> members;

    public Organization(String name, Person person) {
        this.name = name;
        this.members = new ArrayList<>();
        this.members.add(person);
    }

    public Organization() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void addMembers(Person person) {
        this.members.add(person);
    }
}
