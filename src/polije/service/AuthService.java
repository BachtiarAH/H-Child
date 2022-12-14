package polije.service;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Akun;
import model.keyValue;
import repository.AkunRepositoryImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bacht
 */
public class AuthService {

    AkunRepositoryImpl repoAkun = new AkunRepositoryImpl();

    public boolean login(String username, String password) {
        boolean isLogedin = false;
        Akun modelAkun = new Akun();

        modelAkun = repoAkun.getAkunByUsername(username);
        if (modelAkun.getUsername() != null) {
            if (password.equals(modelAkun.getPassword())) {
                isLogedin = true;
            }else{
                JOptionPane.showMessageDialog(null, "password salah");
            }
        }else{
            System.out.println("username tidak ditemukan");
            JOptionPane.showMessageDialog(null, "username tidak ditemukan");
        }
        
        return isLogedin;
    }

}