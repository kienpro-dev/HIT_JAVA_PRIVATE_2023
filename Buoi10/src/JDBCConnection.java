import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    public static Connection getConnection() {
        final String user = "sa";
        final String pass = "1";
        final String dbName = "test";

        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=" + dbName;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
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
