import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create{
    public static void main(String[] args) {
        try{
            String url="jdbc:mysql://localhost:3306/project_data";
            String user="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url, user, pass);
            String c_table = "create table profile(rno int primary key, name varchar(20) not null)";
            Statement s=con.createStatement();
            s.executeUpdate(c_table);
            System.out.println("table created successfullyt");
            System.out.println("Connected");
        }
        catch(SQLException s){
            
            System.out.println(s);

        }
    }
}