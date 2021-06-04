/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemetadata;

/**
 *
 * @author ARYA
 */

import java.sql.*;



public class databasemetadata {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_lab", "root", "12345678");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("getDatabaseProductName:" + dbmd.getDatabaseProductName());
            System.out.println("getDatabaseProductVersion():" + dbmd.getDatabaseProductVersion());
            System.out.println("getDriverName():" + dbmd.getDriverName());
            System.out.println("getDriverVersion():" + dbmd.getDriverVersion());
            System.out.println("getURL():" + dbmd.getURL());
            System.out.println("getUserName():" + dbmd.getUserName());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }//PSVM
}//class

