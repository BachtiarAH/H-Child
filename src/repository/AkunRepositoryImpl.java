/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Akun;

/**
 *
 * @author zam
 */
public class AkunRepositoryImpl  implements AkunRepositoryInterface{
    
    
    private Connection conn ;

    public AkunRepositoryImpl() {
        DatabaseInterface db = new Database();
        conn = db.getDatabase();
    }
    
    
    
    
    @Override
    public boolean register(Akun akun) {
        boolean isRegister = false;
        String query = "insert into akun (username , password , id_user)  values (? , ? , ?)";
        try {
            PreparedStatement pst = this.conn.prepareStatement(query);
            pst.setString(1, akun.getUsername());
            pst.setString(2, akun.getPassword());
            pst.setInt(3, akun.getId_user());
            pst.execute();
            isRegister = true;
        } catch (SQLException e) {
            isRegister = false;
        } 
        return isRegister;
    }
    
}
