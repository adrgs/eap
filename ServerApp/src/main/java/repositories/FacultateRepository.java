package repositories;

import models.Facultate;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacultateRepository {

    public static void save(Facultate facultate) throws SQLException {
        String sql = "INSERT INTO laborator.facultati(nume, oras) VALUES(?,?)";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, facultate.getNume());
        preparedStatement.setString(2, facultate.getOras());
        preparedStatement.execute();
    }

    public static List<Facultate> findByOras(String oras) throws SQLException {
        String sql = "SELECT * FROM laborator.facultati WHERE oras LIKE '"+oras+"'";
        ResultSet resultSet = DbConnection.getConnection().createStatement().executeQuery(sql);
        List<Facultate> faculties = new ArrayList<>();
        while (resultSet.next()) {
            Facultate facultate = new Facultate(
                    resultSet.getInt("id"),
                    resultSet.getString("nume"),
                    resultSet.getString("oras")
            );
            faculties.add(facultate);
        }
        return faculties;
    }

}
