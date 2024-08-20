import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/project_data";
            String user="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url, user, pass);
            String insert="insert into profile() values(?,?)";
            PreparedStatement pre=con.prepareStatement(insert);
            pre.setInt(1,32);
            pre.setString(2,"deepa");
            pre.executeUpdate();
            System.out.println("inserted successfully");   
            System.out.println("Connection success");
        } catch (SQLException e) {
            System.out.println(e);

        }
    }
}
