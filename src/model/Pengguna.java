/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author zam
 */
public class Pengguna extends MainModel{
  
    private String nama;
    private String tempat_lahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private int umur;
    private String alamat;

    public String getAlamat() {
        return alamat;
    }

    @Override
    public int getId() {
        return super.getId(); 
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public int getUmur() {
        return umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void setId(int id) {
        super.setId(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
    
    
    
    
    
}
