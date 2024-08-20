import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update{
    public static void main(String[] args) {
         try {
            String url="jdbc:mysql://localhost:3306/project_data";
            String user="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url, user, pass);
            String update="update profile set name=? where rno=?";
            PreparedStatement pre=con.prepareStatement(update);
            pre.setString(1,"suvi P");
            pre.setInt(2,25);
            pre.executeUpdate();
            System.out.println("Updated successfully");

            System.out.println("Connected");
            } 
            catch (SQLException e) {
            System.out.println(e);

        }
    }
}