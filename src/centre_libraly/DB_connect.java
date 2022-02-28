/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centre_libraly;

import java.sql.*;


import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class DB_connect {
    // database connection
    
    public static Connection getConnection(){
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/NOUL_LIBRALY?useSSL=true";
    String UserName = "root";
    String password = "#vanlakhan0105#ISXM";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
          connection = (Connection) DriverManager.getConnection(url, UserName, password );
           System.out.println("successfull");
       } catch(Exception ex){
           
           System.out.println("error unsuccessful");
       }
       
        return connection;
    }
}
