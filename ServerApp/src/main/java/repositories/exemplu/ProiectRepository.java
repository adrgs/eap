package repositories.exemplu;

import models.exemplu.Proiect;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProiectRepository {
    public static void save(Proiect proiect) throws SQLException {
        String sql = "INSERT INTO laborator.angajati(nume, prenume) VALUES (?,?,?);";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, proiect.getNume());
        preparedStatement.setString(2, proiect.getNumeCompanie());
        preparedStatement.execute();
    }

    public static List<Proiect> findAll() throws SQLException {
        Statement statement = DbConnection.getConnection().createStatement();
        String sql = "SELECT * FROM proiecte";

        ResultSet resultSet = statement.executeQuery(sql);

        List<Proiect> proiects = new ArrayList<>();

        while (resultSet.next()) {
            Proiect proiect = new Proiect(
                    resultSet.getInt("id"),
                    resultSet.getString("nume"),
                    resultSet.getString("nume_companie")
            );
            proiects.add(proiect);
        }
        return proiects;
    }

    public static void delete(Proiect proiect) throws SQLException {
        String sql = "DELETE FROM laborator.proiecte WHERE id=" + proiect.getId();
        Statement statement = DbConnection.getConnection().createStatement();
        statement.execute(sql);
    }
}
