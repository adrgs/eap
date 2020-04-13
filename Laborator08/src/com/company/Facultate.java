package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Facultate {
    private int id;
    private String nume;
    private String oras;

    public Facultate(String nume, String oras) {
        this.nume = nume;
        this.oras = oras;
    }

    public Facultate(int id, String nume, String oras) {
        this.id  = id;
        this.nume = nume;
        this.oras = oras;
    }

    @Override
    public String toString() {
        return "Facultate: [id] " + id + " [nume] " + nume + " [oras] " + oras;
    }

    public static void save(Facultate facultate, Connection connection) throws SQLException {
        //String sql = "INSERT INTO laborator.facultati(nume, oras) VALUES('" + facultate.nume + "', '" + facultate.oras + "')";
        //statement.execute(sql);

        String sql = "INSERT INTO laborator.facultati(nume, oras) VALUES(?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, facultate.nume);
        preparedStatement.setString(2, facultate.oras);
        preparedStatement.execute();
    }

    public static Facultate findById(int id, Statement statement) throws SQLException {
        String sql = "SELECT * FROM laborator.facultati WHERE id=" + id;
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next())
        {
            Facultate facultate = new Facultate(
                    resultSet.getInt("id"),
                    resultSet.getString("nume"),
                    resultSet.getString("oras")
            );
            return facultate;
        }
        return null;
    }

    public static List<Facultate> findByOras(String oras, Statement statement) throws SQLException {
        String sql = "SELECT * FROM facultati WHERE oras LIKE '" + oras + "'";

        List<Facultate> facultati = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Facultate facultate = new Facultate(
                    resultSet.getInt("id"),
                    resultSet.getString("nume"),
                    resultSet.getString("oras")
            );
            facultati.add(facultate);
        }

        return facultati;
    }
}
