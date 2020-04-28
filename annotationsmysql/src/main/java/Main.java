import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)
    {
        try {
            Database.init();
        } catch (Exception e) {
            System.out.println("Database initialization failed");
            e.printStackTrace();
        }

        try {
            Connection connection = Database.getConnection();

            System.out.println("Database connection successful!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
