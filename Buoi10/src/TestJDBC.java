import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) {
        Connection con = JDBCConnection.getConnection();

        String sql = "SELECT * FROM SinhVien";

        try {
            // PrepareStatement
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<username> list = new ArrayList<>();
            while(rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                username user = new username(name, age);
                list.add(user);
            }
            for(username u : list) {
                System.out.println(u);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
