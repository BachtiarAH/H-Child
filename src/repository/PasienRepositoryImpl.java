package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
    private DefaultTableModel model;
    
    public PasienRepositoryImpl() {
        DatabaseInterface db = new Database();
        this.Connection = db.getDatabase();
        this.model = new DefaultTableModel();
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

    @Override
    public void showPasien(JTable table) {
        String query = "select * from pasien";
        model.addColumn("No");
        model.addColumn("ID pasien");
        model.addColumn("Nama Ibu");
        model.addColumn("Nama Anak");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tinggi Badan");
        model.addColumn("Umur(bulan)");
        model.addColumn("Status");
        try {
            Statement st = this.Connection.createStatement();
            ResultSet res = st.executeQuery(query);
            int count = 0;
            while(res.next() || res.isLast()){
                int umur = res.getInt("umur");            
                int tb = res.getInt("tinggiBadan");
                String status = "";
                if(umur <= 6){
                    if(tb < 50.5){
                        status = "Pendek(Sunting)";
                    }else if(tb >= 50.5 && tb <= 66){
                        status = "normal";
                    }else{
                        status = "tinggi";
                    }
                }else if(umur >= 7 && umur <= 12){
                     if(tb < 67.5){
                        status = "Pendek(Sunting)";
                    }else if(tb >= 67.5 && tb <= 74.6){
                        status = "normal";
                    }else{
                        status = "tinggi";
                    }
                }else if(umur >= 13 && umur <= 24){
                     if(tb < 78){
                        status = "Pendek(Sunting)";
                    }else if(tb >= 78 && tb <= 94){
                        status = "normal";
                    }else{
                        status = "tinggi";
                    }
                }else if(umur >= 25 && umur <= 60){
                     if(tb < 96){
                        status = "Pendek(Sunting)";
                    }else if(tb >= 96 && tb <= 119.2){
                        status = "normal";
                    }else{
                        status = "tinggi";
                    }
                }
                count++;
                model.addRow(new Object[]{
                     count , res.getString("id_pasien") , res.getString("nama_ibu")
                        , res.getString("nama_anak") 
                        , res.getString("tempat_lahir") 
                        , res.getString("tanggal_lahir") 
                        , res.getString("jenis_kelamin") , 
                          res.getInt("tinggiBadan") , 
                          res.getString("umur") , 
                          status
                });
                System.out.println(status);
                System.out.println(count);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(PasienRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updatePasien(Pasien pasien) {
        boolean isSucces = false;
        String query =  "UPDATE `pasien` SET "
                + "`nama_anak`= ?,"
                + "`nama_ibu`= ?,"
                + "`tempat_lahir`= ?,"
                + "`jenis_kelamin`= ?,"
                + "`tanggal_lahir`= ?,"
                + "`tinggiBadan`= ?,"
                + "`umur`= ? "
                + "WHERE id_pasien = ?";
        System.out.println(query);
        try {
            PreparedStatement pst = this.Connection.prepareStatement(query);
            pst.setString(1, pasien.getNamaAnak());
            pst.setString(2, pasien.getNamaIbu());
            pst.setString(3, pasien.getTempatLahir());
            pst.setString(4, pasien.getJenisKelamin());
            pst.setDate(5, pasien.getTanggalLahir());
            pst.setInt(6, pasien.getTinggiBadan());
            pst.setInt(7, pasien.getUmur());
            pst.setInt(8, pasien.getId());
            pst.execute();
            isSucces = true;
        } catch (SQLException e) {
            System.out.println("error in PasienRepo in method updatepasien "+e);
            isSucces = false;
        }
        return isSucces;
    }


    
    @Override
    public boolean deletePasien(int id){
        boolean isSucces = false;
        String query =  "DELETE FROM `pasien` WHERE id_pasien = ?";
        System.out.println(query);
        try {
            PreparedStatement pst = this.Connection.prepareStatement(query);
            pst.setInt(1, id);
            pst.execute();
            isSucces = true;
        } catch (SQLException e) {
            System.out.println("error in PasienRepo in method updatepasien "+e);
            isSucces = false;
        }
        return isSucces;
    }
    
    
}
