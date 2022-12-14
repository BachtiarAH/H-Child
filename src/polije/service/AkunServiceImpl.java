/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polije.service;

import javax.swing.JOptionPane;
import model.Akun;
import repository.AkunRepositoryImpl;
import repository.PenggunaRepositoryImpl;

/**
 *
 * @author zam
 */
public class AkunServiceImpl  implements AkunServiceInterface{

    private AkunRepositoryImpl repository ;
    private PenggunaRepositoryImpl repositoryImpl;

    public AkunServiceImpl() {
        this.repository = new AkunRepositoryImpl();
    }
    
    @Override
    public boolean register(String username , String password) {
        try {
        int id = this.repositoryImpl.getLastInsertId();
        Akun akun = new Akun();
        akun.setId_user(id);
        akun.setUsername(username);
        akun.setPassword(password);
        boolean isRegister = this.repository.register(akun);
        return isRegister;
        } catch (NullPointerException e) {
            return false;
        }
    }
    
    
}
