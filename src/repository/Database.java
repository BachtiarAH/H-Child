/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zam
 */
public class Database implements DatabaseInterface{
     
  
    public static Connection mySqlCon;
    
    public  static Connection conectDatabase() {
        try{
                String jdbcUrl="jdbc:mysql://localhost/hchild";
                String jdbcUser="root";
                String jdbcPassword="";
                mySqlCon=DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword );
                System.out.println("berhasil connec database");
        }catch(SQLException e){
            System.out.println(e.getCause());
            System.exit(0);
        }
        return mySqlCon;
    }
      static {
        try{
            
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            conectDatabase();
        }catch(SQLException e){
            System.out.println("Gagal Register Driver");
        }     
    }

    @Override
    public Connection getDatabase() {
        return mySqlCon;
    }
    
}
