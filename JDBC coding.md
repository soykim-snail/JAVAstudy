#### JDBC coding

```java
import java.sql.*;
public class TestJdbc {
    pubic static void main(String[] args) {
        
        //Fisrt.. loading JDBC driver!
        try {
            //What is .forName(String className) ?
			//Returns the Class object associated with the class or interface with the given string name.
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.err.println(e);
            e.printStackTrace();
        }
        
        //Second.. connect to the target DB
        //Third.. generate a Statement instance
        try (	
            //What is .getConnection(String url) ?
			//Attempts to establish a connection to the given database URL.
            Connection conn = DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:XE", "ACCOUNT", "PASSWORD");
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ){
            
        } catch (Exception e) {
            System.out.println(e);
            System.err.println(e);
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
}
```

