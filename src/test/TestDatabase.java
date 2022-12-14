package test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import polije.service.PenggunaServiceImpl;
import polije.service.PenggunaServiceInterface;
import repository.Database;
import repository.DatabaseInterface;

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
        Date dt = calendar.getTime();
        boolean isRegister =  penggunaServiceInterface.register("jj", "bwi", new java.sql.Date(dt.getTime()) , "Laki-laki", 1, "banyuwangi");  
    }
}
