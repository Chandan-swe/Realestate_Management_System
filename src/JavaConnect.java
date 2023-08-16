
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
    Connection conn=null;
    public static Connection  ConnecrDb(){
        
        try{
          Class.forName("org.sqlite.JDBC") ;
          Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\DIU\\Documents\\NetBeansProjects\\RealEstateManagementSystem\\RealEstateManagementSystem.sqlite");
        //databaseconnect
          return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
