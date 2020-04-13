package com.company;

import java.sql.SQLException;
import java.sql.Statement;

public class Facultate {
    private int id;
    private String nume;
    private String oras;

    public Facultate(String nume, String oras) {
        this.nume = nume;
        this.oras = oras;
    }

    @Override
    public String toString() {
        return "Facultate: [id] " + id + " [nume] " + nume + " [oras] " + oras;
    }

    public static void save(Facultate facultate, Statement statement) throws SQLException {
        String sql = "INSERT INTO laborator.facultati(nume, oras) VALUES('" + facultate.nume + "', '" + facultate.oras + "')";
        statement.execute(sql);
    }
}
