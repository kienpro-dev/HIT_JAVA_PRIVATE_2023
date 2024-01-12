import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPoolImpl implements ConnectionPool{
    private String user;

    private String password;

    private String url;

    private Stack<Connection> pools;

    public ConnectionPoolImpl() {
        user = "root";
        password = "root";
        pools = new Stack<>();

        url = "jdbc:mysql://localhost:3306/test";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public Connection getConnection() {
        if(pools.isEmpty()) {
            try {
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return pools.pop();
    }

    @Override
    public void releaseConnection(Connection con) {
        pools.push(con);
    }

    @Override
    protected void finalize() throws Throwable {
        pools.clear();
        pools = null;
    }
}
