/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polije.service;

import java.sql.Date;
import model.Pasien;
import model.Pengguna;
import repository.PenggunaRepositoryImpl;

/**
 *
 * @author zam
 */
public class PenggunaServiceImpl implements  PenggunaServiceInterface{

    private PenggunaRepositoryImpl repository;
    
    public PenggunaServiceImpl() {
        this.repository = new PenggunaRepositoryImpl();
    }
    @Override
    public boolean register(String nama, String tempat_lahir,java.sql.Date tanggal_lahir , String jenisKelamin, String alamat) {
        System.out.println("service");
        boolean isSucces = false;
          try {
              System.out.println("ke");
              Pengguna pengguna = new Pengguna();
              pengguna.setNama(nama);
              pengguna.setTempat_lahir(tempat_lahir);
              pengguna.setAlamat(alamat);
              pengguna.setJenisKelamin(jenisKelamin);
              pengguna.setTanggalLahir(tanggal_lahir);
              isSucces =  this.repository.register(pengguna);
        } catch (Exception e) {
            System.out.println(e);
            isSucces = false;
        }
        return isSucces;
    }

    @Override
    public int getLastInsertId() {
        return this.repository.getLastInsertId();
    }

    @Override
    public boolean findByUsername(String username) {
       return  this.repository.findByUsername(username);
    }


    
    
    
    
}
