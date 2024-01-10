import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) {
        them();
        Connection con = JDBCConnection.getConnection();

        String sql = "SELECT * FROM SinhVien";
        List<username> list = new ArrayList<>();
        try {
            // PrepareStatement
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                username user = new username(name, age);
                list.add(user);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



        for(username u : list) {
            System.out.println(u);
        }
    }

    public static void them() {
        username a = new username("Minh", 18);
        Connection conn = JDBCConnection.getConnection();

        String sql = "INSERT INTO SinhVien VALUE(?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getName());
            ps.setString(1, "TEST2");
            ps.setInt(2, a.getAge());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
