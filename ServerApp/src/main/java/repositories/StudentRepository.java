package repositories;

import models.Student;
import utils.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRepository {

    public static void save(Student student) throws SQLException {
        String sql = "INSERT INTO laborator.studenti(nume, username, id_facultate) VALUES(?,?,?)";
        PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, student.getNume());
        preparedStatement.setString(2, student.getUsername());
        preparedStatement.setInt(3, student.getIdFacultate());
        preparedStatement.execute();
    }

    public static Student findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM laborator.studenti WHERE username LIKE '"+username+"'";
        ResultSet resultSet = DbConnection.getConnection().createStatement().executeQuery(sql);
        if (resultSet.next()) {
            Student student = new Student(
                resultSet.getInt("id"),
                resultSet.getString("nume"),
                resultSet.getString("username"),
                resultSet.getInt("id_facultate")
            );
            return student;
        }
        return null;
    }

}
