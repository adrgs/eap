package repositories.exemplu;

import models.exemplu.Angajat;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AngajatRepository {

    public static Angajat save(Angajat angajat) throws SQLException {
        String sql = "INSERT INTO laborator.angajati(nume, prenume) VALUES (?,?,?);";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, angajat.getNume());
        preparedStatement.setString(2, angajat.getPrenume());
        preparedStatement.setString(3, angajat.getUsername());

        preparedStatement.execute();

        return AngajatRepository.findByUsername(angajat.getUsername());
    }

    public static Angajat findByUsername(String username) throws SQLException {

        String sql = "SELECT * FROM laborator.angajati WHERE username LIKE '"+username+"'";
        ResultSet resultSet = DbConnection.getConnection().createStatement().executeQuery(sql);
        if (resultSet.next()) {
            Angajat angajat = new Angajat(
                    resultSet.getInt("id"),
                    resultSet.getString("nume"),
                    resultSet.getString("prenume"),
                    resultSet.getString("username")
            );
            return angajat;
        }
        return null;

    }

    public static void delete(Angajat angajat) throws SQLException {
        String sql = "DELETE FROM laborator.angajati WHERE id=" + angajat.getId();
        Statement statement = DbConnection.getConnection().createStatement();
        statement.execute(sql);
    }

}
