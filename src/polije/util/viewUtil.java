/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polije.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author bacht
 */
public class viewUtil {
    public static void setSideBar(JPanel mainPanel, JPanel panel){
        //cleaning panel
        mainPanel.removeAll();
        System.out.println("set sidebar");
        //adding panel
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public static void changePanel(JPanel mainPanel, JPanel panel){
//        mainPanel.add(panel);
//        mainPanel.repaint();
//        mainPanel.revalidate();;
        mainPanel.hide();
        System.out.println("change panel");
    }
}
