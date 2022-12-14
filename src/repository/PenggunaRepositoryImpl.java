package repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pengguna;
import polije.util.viewUtil;
import repository.Database;
import repository.DatabaseInterface;
import repository.PengunaRepositoryInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zam
 */
public class PenggunaRepositoryImpl implements PengunaRepositoryInterface{

    private Connection connection;
    public PenggunaRepositoryImpl() {
        DatabaseInterface db = new Database();
        connection = db.getDatabase();
    }
    @Override
    public boolean register(Pengguna pengguna) {
        boolean isSucces = false;
        try {     
        String query = "insert into pengguna (nama , tempat_lahir , tanggal_lahir , jenis_kelamin , umur , alamat ) "
                + "values (? , ? , ? , ? , ? , ?)";
            PreparedStatement pst = this.connection.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, pengguna.getNama());
            pst.setString(2, pengguna.getTempat_lahir());
            pst.setDate(3, pengguna.getTanggalLahir());
            pst.setString(4, pengguna.getJenisKelamin());
            pst.setInt(5, pengguna.getUmur());
            pst.setString(6, pengguna.getAlamat());
            pst.execute();
            
            isSucces = true;
        } catch (SQLException e) {
            System.out.println(e.getCause());
              isSucces = false;
        } 
        return isSucces;
    }
    @Override
    public boolean login(Pengguna pengguna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int getLastInsertId() {
        try {
            int id = 0;
        Statement st = this.connection.createStatement();
        String query = "select id_user from pengguna ORDER BY id_user DESC LIMIT 1";
        ResultSet res = st.executeQuery(query);
        if(res.next()){
            id = res.getInt("id_user");
            return id;
        }else{
            return id;
        }
        } catch (SQLException e) {
            return 0;
        }
    }

        
    
}
