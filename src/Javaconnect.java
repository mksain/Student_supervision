import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect 
{
    Connection conn=null;
    
    public static Connection Connect_DB()
    {
     try
     {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:Supervision.sqlite");
        return conn;
        
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
    }
    
}
