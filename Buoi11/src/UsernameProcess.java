import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsernameProcess {
    private Connection connection;

    private ConnectionPool cp;

    public UsernameProcess() {
        this.cp = new ConnectionPoolImpl();

        try {
            this.connection = this.cp.getConnection();
            if (this.connection.getAutoCommit()) {
                this.connection.setAutoCommit(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Username> getUsers() {
        List<Username> list = new ArrayList<>();

        String sql = "SELECT * FROM SinhVien";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs != null) {
                while(rs.next()) {
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    list.add(new Username(name, age));
                }
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return list;
    }

    public boolean addUser(Username u) {
        String sql = "INSERT INTO SinhVien(name, age) VALUE(?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, u.getName());
            ps.setInt(2, u.getAge());

            if(ps.executeUpdate() == 0) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(String name) {
        String sql = "DELETE FROM SinhVien WHERE name = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, name);

            if(ps.executeUpdate() == 0) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateUser(String name, int age) {
        String sql = "UPDATE SinhVien SET age = ? WHERE name = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, age);
            ps.setString(2, name);

            if(ps.executeUpdate() == 0) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) {
        UsernameProcess up = new UsernameProcess();

        up.addUser(new Username("Test 222", 10));
        up.addUser(new Username("Test 333", 10));

        up.deleteUser("Test 333");

        List<Username> list = up.getUsers();

        list.forEach(System.out::println);
    }
}