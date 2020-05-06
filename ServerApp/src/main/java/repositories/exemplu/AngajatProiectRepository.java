package repositories.exemplu;

import models.exemplu.AngajatProiect;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AngajatProiectRepository {

    public static void save(AngajatProiect proiect) throws SQLException {
        String sql = "INSERT INTO laborator.angajat_proiect(id_angajat, id_proiect) VALUES (?,?);";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, proiect.getIdAngajat());
        preparedStatement.setInt(2, proiect.getIdProiect());
        preparedStatement.execute();
    }


}
