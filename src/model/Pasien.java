package model;


import java.sql.Date;
import model.MainModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zam
 */
public class Pasien extends MainModel{
    
    
    private String namaAnak;
    private String namaIbu;
    private String tempatLahir;
    private String jenisKelamin;
    private Date tanggalLahir;
    private int tinggiBadan;
    private int umur;

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
    

    @Override
    public void setId(int id) {
        super.setId(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNamaAnak(String namaAnak) {
        this.namaAnak = namaAnak;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    @Override
    public int getId() {
        return super.getId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }
    
    
    
}
