/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polije.service;

import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import model.Pasien;
import repository.PasienRepositoryImpl;
import repository.PassienRepositoryInterface;

/**
 *
 * @author zam
 */
public class PassienServiceImpl implements PassienServiceInterface{

    private PassienRepositoryInterface repository;

    public PassienServiceImpl() {
        this.repository = new PasienRepositoryImpl();
    }
    @Override
    public boolean addPasien(String namaAnak,
            String namaIbu, 
            String tempatLahir,
            String jenisKelamin, java.sql.Date tanggalLahir, int tinggiBadan , int umur) {
        boolean isSucces = false;
        try {
            Pasien pasien = new Pasien();
            pasien.setNamaAnak(namaAnak);
            pasien.setJenisKelamin(jenisKelamin);
            pasien.setNamaIbu(namaIbu);
            pasien.setTanggalLahir(tanggalLahir);
            pasien.setTempatLahir(tempatLahir);
            pasien.setTinggiBadan(tinggiBadan);
            pasien.setUmur(umur);
            boolean response = this.repository.addPasien(pasien);
            System.out.println(response);
            isSucces = response;
        } catch (NullPointerException e) {
            System.out.println("Get Exception on Service");
            isSucces = false;
        }
        return isSucces;
    }
    
    public int getAge(Date date){
        LocalDate now = LocalDate.now();
        LocalDate dates = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = Period.between(dates, now).getMonths();
        return month;
    }
}
