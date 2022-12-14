package test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import polije.service.PenggunaServiceImpl;
import polije.service.PenggunaServiceInterface;
import repository.Database;
import repository.DatabaseInterface;
import repository.PenggunaRepositoryImpl;
import repository.PengunaRepositoryInterface;
import java.sql.Date;
import model.Pengguna;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zam
 */
public class TestDatabase {
    
    public static void main(String[] args) {
        PenggunaServiceInterface penggunaServiceInterface = new PenggunaServiceImpl();
        Calendar calendar = Calendar.getInstance();
        String tgl = "2022-12-02";
        PengunaRepositoryInterface repo = new PenggunaRepositoryImpl();
        Pengguna pengguna = new Pengguna();
        pengguna.setNama("zam");
        pengguna.setAlamat("asdasd");
        pengguna.setJenisKelamin("laki laki");
        java.util.Date dateuril = calendar.getTime();
        java.sql.Date dtSql = new Date(dateuril.getDate());
        pengguna.setTempat_lahir("bwi");
        pengguna.setTanggalLahir(dtSql);
    boolean response =     repo.register(pengguna);
        System.out.println(response);
    }
}
