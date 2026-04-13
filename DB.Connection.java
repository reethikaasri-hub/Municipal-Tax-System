import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/municipal_tax",
                "root",
                "ReethikaA@0313"
            );

            return con;

        } catch (Exception e) {
            System.out.println("ERROR OCCURRED:");
            e.printStackTrace();  // THIS LINE
            return null;
        }
    }
}
