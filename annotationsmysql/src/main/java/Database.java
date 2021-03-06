import java.io.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://db.springbike.site:3306/springbike";
    static String USER = null;
    static String PASS = null;
    private Database() { }
    public static void init() throws ClassNotFoundException, IOException, RuntimeException {
        if (USER != null && PASS != null) throw new RuntimeException("Database class can only be initalized once");
        Class.forName(JDBC_DRIVER);

        ClassLoader classLoader = Database.class.getClassLoader();
        URL resource = classLoader.getResource("credentials.txt");
        if (resource == null) {
            throw new RuntimeException("File credentials.txt not found");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(resource.getFile()));
        USER = bufferedReader.readLine();
        PASS = bufferedReader.readLine();
}
    public static Connection getConnection() throws SQLException, RuntimeException {
        if (USER == null || PASS == null) throw new RuntimeException("Initialization failed");

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        return connection;
    }
}
