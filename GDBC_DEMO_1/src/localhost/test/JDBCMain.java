
package localhost.test;
import com.mysql.cj.MysqlType;
import java.io.FileInputStream;
import java.sql.Connection;


import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author RAZAFIMAHATRATRA
 */
public class JDBCMain 
{
    
     
    public static void main(String[] args) throws Exception 
    {
        
       
        Connection c = null;
        
       // ETAPE  0 : CHARGEMENT DU FICHIER PROPERTIES
       Properties pr = new Properties();
       pr.load(new FileInputStream("E:\\tsisy dikany\\javaswing\\GDBC_DEMO_1\\db.properties"));
       String dbUser = pr.getProperty("dbUser");
       String dbPasswd = pr.getProperty("dbPasswd");
       String dbHost = pr.getProperty("dbHost");
       
       
        // ETAPE 1 : etablir  connection
        c = DriverManager.getConnection(dbHost,dbUser ,dbPasswd );
        System.out.println("Connexion etablie");
      
      
    }
         
}
