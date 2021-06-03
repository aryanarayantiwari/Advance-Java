/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;

/**
 *
 * @author ARYA
 */
import java.sql.*;
public class DemoJDBC {
public static void main(String[] args) {
  try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_lab","root","12345678");
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * from student");
       while(rs.next()){
        		System.out.print(rs.getInt(1)+"\t");
        		System.out.print(rs.getString("Name")+"\t");
        		System.out.println(rs.getString(2));
        }//while
        stmt.close();
        conn.close();
    }catch(Exception e){System.out.println(e.toString());
   }//PSVM  }//class
}
}
