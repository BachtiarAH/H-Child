/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package polije.service;

import java.util.Date;
import java.time.LocalDate;
import javax.swing.JTable;

/**
 *
 * @author zam
 */
public interface PassienServiceInterface {
    
    public boolean addPasien(String namaAnak , String namaIbu , String tempatLahir , String jenisKelamin , java.sql.Date tanggalLahir , int tinggiBadan , int umur);
    public int getAge(Date localDate);
    public void showPassien(JTable table);
    public boolean updatePasien(String namaAnak , String namaIbu , String tempatLahir , String jenisKelamin , java.sql.Date tanggalLahir , int tinggiBadan , int umur , int id);
    public boolean deletePasien(String id);
}
