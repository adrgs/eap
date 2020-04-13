package com.company;


import java.sql.*;

public class LaboratorDB {

    //JDBC Driver and DB URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:33306";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args)
    {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USER, PASS);
            Statement statement = connection.createStatement();

            //String sql = "INSERT INTO laborator.facultati(nume, oras) VALUES ('Facultatea de Mate-Info', 'Bucuresti')";
            //statement.execute(sql);
            //statement.execute("INSERT INTO laborator.facultati(nume, oras) VALUES ('Facultatea de Mate-Info', 'Iasi')");
            //statement.execute("INSERT INTO laborator.facultati(nume, oras) VALUES ('Facultatea de Istorie', 'Bucuresti')");
            //statement.execute("INSERT INTO laborator.facultati(nume, oras) VALUES ('Facultatea de Limbi Straine', 'Cluj')");

            //String sql = "SELECT * FROM laborator.facultati";
            //ResultSet resultSet = statement.executeQuery(sql);
            //while (resultSet.next())
            //{
            //    System.out.print(resultSet.getInt("id") + " ");
            //    System.out.print(resultSet.getString("nume") + " ");
            //    System.out.println(resultSet.getString("oras"));
            //}

            //Inserare obiecte in DB

            Facultate facultate = new Facultate("Facultatea de Geologie", "Bucuresti");
            Facultate.save(facultate, statement);


            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
