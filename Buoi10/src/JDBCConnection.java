import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    public static Connection getConnection() {
        final String user = "root";
        final String pass = "root";
        final String dbName = "test";

        String url = "jdbc:mysql://localhost:3306/" + dbName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
        if(connection == null) {
            System.out.println("Khong ket noi");
        } else {
            System.out.println("Ket noi thanh cong");
        }
    }
}
