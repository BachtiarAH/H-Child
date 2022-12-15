/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.Pasien;
import model.Pengguna;

/**
 *
 * @author zam
 */
public interface PengunaRepositoryInterface {
    
    
    public boolean register(Pengguna pengguna);
    public boolean login(Pengguna pengguna);
    public int getLastInsertId();
    public boolean findByUsername(String username);
    
}
