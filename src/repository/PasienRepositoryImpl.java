package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pasien;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zam
 */
public class PasienRepositoryImpl implements PassienRepositoryInterface{
    
    
    private Connection Connection;

    public PasienRepositoryImpl() {
        DatabaseInterface db = new Database();
        this.Connection = db.getDatabase();
    }

    @Override
    public boolean addPasien(Pasien pasien) {
        boolean isSucces = false;
        String query =  "insert into pasien (nama_anak , nama_ibu , tempat_lahir , jenis_kelamin , tanggal_lahir , tinggiBadan , umur ) values (? , ? , ? , ? , ? , ? , ?)";
        try {
            PreparedStatement pst = this.Connection.prepareStatement(query);
            pst.setString(1, pasien.getNamaAnak());
            pst.setString(2, pasien.getNamaIbu());
            pst.setString(3, pasien.getTempatLahir());
            pst.setString(4, pasien.getJenisKelamin());
            pst.setDate(5, pasien.getTanggalLahir());
            pst.setInt(6, pasien.getTinggiBadan());
            pst.setInt(7, pasien.getUmur());
            pst.execute();
            isSucces = true;
        } catch (SQLException e) {
            System.out.println(e);
            isSucces = false;
        }
        return isSucces;
    }
}
