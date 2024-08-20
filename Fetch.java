import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fetch {
    public static void main(String[] args) {
        

        try {
            String url = "jdbc:mysql://localhost:3306/project_data";
            String user = "root";
            String pass = "root";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");

            String query = "SELECT * FROM profile";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.println("Current data:");
                
                System.out.println("roll_no: " + rs.getInt("rno"));
                System.out.println("name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
    

