/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polije.service;

import java.sql.Date;

/**
 *
 * @author zam
 */
public interface PenggunaServiceInterface {
    
    public boolean register(String nama , String tempat_lahir  ,Date tanggal_Lahir ,  String jenisKelamin , int umur , String alamat);
    
}
