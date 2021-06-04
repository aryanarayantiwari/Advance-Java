/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcmetadata;

/**
 *
 * @author ARYA
 */
/**
 * @param args the command line arguments
 */
import java.sql.*;

public class Jdbcmetadata {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_lab", "root", "12345678");
            Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * from student");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column:" + rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column:"+rsmd.getColumnTypeName(1));  
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//PSVM
}//class

