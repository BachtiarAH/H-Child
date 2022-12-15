/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import javax.swing.JTable;
import model.Pasien;

/**
 *
 * @author zam
 */
public interface PassienRepositoryInterface {
    
    public boolean addPasien(Pasien pasien);
    public void showPasien(JTable table);
    public boolean updatePasien(Pasien pasien);
    public boolean deletePasien(int id);
}
