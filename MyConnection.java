import java.sql.*;

public class MyConnection {

    protected static Connection conn;
    protected PreparedStatement pre = null;

    public MyConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "12345678");
            }
        } catch (Exception e) {
            System.out.println("Create Connection Error");
        }
    }
}